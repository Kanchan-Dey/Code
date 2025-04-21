package linkedlist;


	import java.util.Comparator;

	public class CompareByName implements Comparator<Student> {
	public int compare(Student e1,Student e2)
	{
		return e1.name.compareTo(e2.name);
	}
	}


