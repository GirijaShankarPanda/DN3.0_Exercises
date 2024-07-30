//This is the main class that demonstrates dependency injection.
//It creates a `CustomerRepositoryImpl` object and injects it into the `CustomerService` using constructor injection.
//It uses the `CustomerService` to find and display a customer.

public class DependencyInjectionExample {
    public static void main(String[] args) {
        // Create the repository
        CustomerRepository customerRepository = new CustomerRepositoryImpl();

        // Inject the repository into the service
        CustomerService customerService = new CustomerService(customerRepository);

        // Use the service to find a customer
        Customer customer = customerService.getCustomerById("2141016383");

        // Display the customer details
        System.out.println(customer);
    }
}
