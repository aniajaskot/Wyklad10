package exercise2;

public class Patient {
    private String firstName;
    private String lastName;
    private String pesel;

    public Patient(String firstName, String lastName, String pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " PESEL " + pesel;
    }
}
