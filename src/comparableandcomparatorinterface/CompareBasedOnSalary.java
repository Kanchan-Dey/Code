package comparableandcomparatorinterface;

import java.util.Comparator;

public class CompareBasedOnSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.salary, o2.salary);
	}

}
