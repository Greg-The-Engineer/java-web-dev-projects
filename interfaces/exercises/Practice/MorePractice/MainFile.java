import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainFile {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Create employee objects
        employees.add(new Employee("Henry", "Mill", 103));
        employees.add(new Employee("Nal", "Brown", 9));
        employees.add(new Employee("Frank", "Hop", 865));
        employees.add(new Employee("Deborah", "King", 980));
        employees.add(new Employee("George", "Sky", 111));

        // Sort employees by last name
        Collections.sort(employees);

        // Print sorted employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}