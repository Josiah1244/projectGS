import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Address address;
    private String userName;
    private String password;
    private List<Customer> friends;
    public Customer(Address address, String userName, String password) {
        this.address = address;
        this.userName = userName;
        this.password = password;
        this.friends = new ArrayList<>();
    }
    
}