package lambdaexpressionmethods;

public class Employee implements Comparable<Employee> {
    String name;
    int id;
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String toString() {
        return name + " " + id;
    }
    public int compareTo(Employee e) {
        return this.id - e.id;
    }
}