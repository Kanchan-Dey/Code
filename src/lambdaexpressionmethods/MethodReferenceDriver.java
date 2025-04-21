package lambdaexpressionmethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDriverClass {
	public static void main(String[] args) {
		LambdaDemo l1 = () -> System.out.println("HEllo");
		l1.print();// here the print statement gets targeted to print()
		LamdaDemo2 l2 = () -> {
			System.out.println("hello");
			
		};
		l2.greet();
		LambdaDemo3 l3 = (a,b)->{//the placeholder variable must not have any value
			if(a>b)
				
			    return a;
			else 
				
				return b;
			
		};
		System.out.println(l3.check(10, 20));
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		System.out.println(list);
		Comparator<Integer> c = (o1,o2)->o2-o1;
		Collections.sort(list,c);
		System.out.println(list);
	}
}
