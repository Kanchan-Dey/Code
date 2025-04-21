package list;

import java.util.Comparator;

public class CompareByName implements Comparator<Employee> {
public int compare(Employee e1,Employee e2)
{
	return e1.name.compareTo(e2.name);
}
}
