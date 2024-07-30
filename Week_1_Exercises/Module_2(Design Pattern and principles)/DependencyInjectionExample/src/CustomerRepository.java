//This is the repository interface with a method `findCustomerById(String id)` that all repository implementations must implement.

public interface CustomerRepository {
    Customer findCustomerById(String id);
}
