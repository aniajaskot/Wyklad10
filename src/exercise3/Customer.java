package exercise3;

public class Customer {
    private Long id;
    private String firstName;
    private String lastName;
    private String telNumber;

    public Customer(Long id, String firstName, String lastName, String telNumber) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telNumber = telNumber;
    }

    @Override
    public String toString() {
        return id + " " + firstName + " " + lastName + " " + telNumber;
    }
}
