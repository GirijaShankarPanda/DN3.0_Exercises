package com.example.EmployeeManagementSystem.Service;

import com.example.EmployeeManagementSystem.Model.Employee;
import com.example.EmployeeManagementSystem.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Fetch paginated and sorted employee list
    public Page<Employee> getPaginatedAndSortedEmployees(int page, int size, String sortBy) {
        Pageable pageable = PageRequest.of(page, size, Sort.by(sortBy));
        return employeeRepository.findAll(pageable);
    }

    // Perform batch operations
    @Transactional
    public void saveEmployeesInBatch(List<Employee> employees) {
        int batchSize = 20; // Define your batch size
        for (int i = 0; i < employees.size(); i++) {
            employeeRepository.save(employees.get(i));

            if (i % batchSize == 0 && i > 0) {
                // Flush a batch of inserts and release memory
                employeeRepository.flush();
                employeeRepository.clear();
            }
        }
    }

    @Transactional
    public void updateEmployeesInBatch(List<Employee> employees) {
        int batchSize = 20; // Define your batch size
        for (int i = 0; i < employees.size(); i++) {
            employeeRepository.save(employees.get(i));

            if (i % batchSize == 0 && i > 0) {
                // Flush a batch of updates and release memory
                employeeRepository.flush();
                employeeRepository.clear();
            }
        }
    }

    @Transactional
    public void deleteEmployeesInBatch(List<Long> employeeIds) {
        int batchSize = 20; // Define your batch size
        for (int i = 0; i < employeeIds.size(); i++) {
            employeeRepository.deleteById(employeeIds.get(i));

            if (i % batchSize == 0 && i > 0) {
                // Flush a batch of deletes and release memory
                employeeRepository.flush();
                employeeRepository.clear();
            }
        }
    }
}
