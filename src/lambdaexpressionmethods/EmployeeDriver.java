package lambdaexpressionmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeDriver {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList();
        Comparator c = (o1,o2)->((Employee)o1).name.compareTo(((Employee)o2).name);
      //Comparator<Employee> c = (o1,o2)->o1.id-o2.id. THis is the same as the id comparision
        employees.add(new Employee("AJ",1));
        employees.add(new Employee("AD",7));
        employees.add(new Employee("AB",3));
        Collections.sort(employees,c);
        System.out.println(employees);
    }
}