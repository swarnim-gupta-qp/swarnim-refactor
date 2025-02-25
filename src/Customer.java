import java.util.ArrayList;
import java.util.List;

// Represents a customer in the system
class Customer {
    String name;
    CustomerType customerType;

    public Customer(String name, CustomerType customerType) {
        this.name = name;
        this.customerType = customerType;
    }
}
