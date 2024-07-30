//This is the service class that depends on the `CustomerRepository` interface.
//It uses constructor injection to inject a `CustomerRepository` implementation.
//The `getCustomerById` method uses the repository to find a customer by ID.

public class CustomerService {
    private final CustomerRepository customerRepository;

    // Constructor Injection
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer getCustomerById(String id) {
        return customerRepository.findCustomerById(id);
    }
}
