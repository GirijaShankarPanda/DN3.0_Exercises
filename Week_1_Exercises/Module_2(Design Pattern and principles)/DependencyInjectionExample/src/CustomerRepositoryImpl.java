//This is the concrete repository class that implements the `CustomerRepository` interface.
//It has a simple implementation of the `findCustomerById` method that returns a dummy customer for demonstration purposes.

public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        return new Customer(id, "Girija", "girija@cognizant.com");
    }
}
