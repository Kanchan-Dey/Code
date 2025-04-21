package treesets;

import java.util.Comparator;

public class CompareByName implements Comparator<Employee>{
    public int compare(Employee e1,Employee e2)
    {
    	return e2.name.compareTo(e1.name);
    }
}
