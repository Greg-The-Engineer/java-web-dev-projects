public class Employee implements Comparable<Employee> {
    private String firstName;
    private String lastName;
    private int id;

    public Employee(String firstName, String lastName, int id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getId() {
        return id;
    }

    @Override
    public int compareTo(Employee other) {
        // Compare employees by last name
        return this.lastName.compareTo(other.lastName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + id;
    }
}