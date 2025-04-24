package reflectionApi;

import java.lang.reflect.Field;

public class EmployeeDriver {
public static void main(String[] args) throws Exception {
	Class<Employee> employee = Employee.class;
	Field[] fields = employee.getDeclaredFields();
	Employee e = new Employee("Kanchan",12,12,1.0);
	for(Field field: fields)
	{
		System.out.println(field.getName());
	}
	Field f = employee.getDeclaredField("name");
	f.setAccessible(true);
	f.set(e,"Kanch");
	System.out.println(f.get(e));
}
}
