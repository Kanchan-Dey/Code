package comparableandcomparatorinterface;

import java.util.Comparator;

public class CompareEmployeeById implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return Integer.compare(e1.id, e2.id);
	}
     
}
