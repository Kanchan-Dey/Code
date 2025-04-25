package oopspractice;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
public class Driver {

	    public static void main(String[] args) {
	        // 1. Create department
	        Department engineeringDept = new Department("Engineering");
	        
	        try {
	            // 2. Add employees (testing exceptions and polymorphism)
	            engineeringDept.addEmployee(new Developer("EMP001", "Alice", 80000, "Java"));
	            engineeringDept.addEmployee(new Manager("EMP002", "Bob", 100000, 5));
	            engineeringDept.addEmployee(new Developer("EMP003", "Charlie", 75000, "Python"));
	            engineeringDept.addEmployee(new Manager("EMP004", "Diana", 120000, 8));
	            
	            // 3. Test invalid ID (should throw exception)
	            // engineeringDept.addEmployee(new Developer("INVALID", "Eve", 50000, "C++"));
	            
	        } catch (InvalidEmployeeException | DepartmentFullException e) {
	            System.err.println("Error adding employee: " + e.getMessage());
	        }

	        // 4. Test polymorphism and bonus calculation
	        System.out.println("\n--- Employee Bonuses ---");
	        engineeringDept.getEmployees().forEach(e -> 
	            System.out.printf("%s (ID: %s): $%.2f bonus%n", 
	                e.getName(), e.getId(), e.calculateBonus())
	        );

	        // 5. Sorting examples
	        System.out.println("\n--- Employees Sorted by Name ---");
	        engineeringDept.getEmployees().stream()
	            .sorted()
	            .forEach(e -> System.out.println(e.getName()));

	        System.out.println("\n--- Employees Sorted by Salary (Descending) ---");
	        engineeringDept.getEmployees().stream()
	            .sorted(new CompareBySalary())
	            .forEach(e -> System.out.println(e.getName() + ": $" + e.getSalary()));

	        // 6. Stream API operations
	        System.out.println("\n--- Java Developers ---");
	        List<Developer> javaDevs = engineeringDept.getEmployees().stream()
	            .filter(Developer.class::isInstance)
	            .map(Developer.class::cast)
	            .filter(d -> "Java".equals(d.getProgrammingLanguage()))
	            .collect(Collectors.toList());
	        javaDevs.forEach(d -> System.out.println(d.getName()));

	        // 7. Lambda expressions
	        System.out.println("\n--- Employee Names in Uppercase ---");
	        engineeringDept.getEmployees()
	            .forEach(e -> System.out.println(e.getName().toUpperCase()));

	        System.out.println("\n--- Managers Sorted by Team Size ---");
	        engineeringDept.getEmployees().stream()
	            .filter(Manager.class::isInstance)
	            .map(Manager.class::cast)
	            .sorted((m1, m2) -> Integer.compare(m1.getTeamSize(), m2.getTeamSize()))
	            .forEach(m -> System.out.println(m.getName() + ": Team of " + m.getTeamSize()));

	        // 8. Iterator usage
	     // Change the iterator usage to:
	        System.out.println("\n--- Iterating Through Employees ---");
	        for (Employee e : engineeringDept.getEmployees()) {
	            System.out.println(e);
	        }
	        // 9. Association demonstration
	        System.out.println("\n--- Department Info ---");
	        System.out.println("Department: " + engineeringDept.getName());
	        System.out.println("Employee Count: " + engineeringDept.getEmployees().size());
	        System.out.println("Highest Paid: " + 
	            engineeringDept.getHighestPaidEmployee().map(Employee::getName).orElse("None"));
	    }
	}

