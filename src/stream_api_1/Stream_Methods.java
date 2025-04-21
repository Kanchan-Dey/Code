package stream_api_1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_Methods {
public static void main(String[] args) {
	List<Integer>list = Arrays.asList(1,1,1,1,1,1,1,2);
	System.out.println(list);
	//to print only the uniques we usually would make a loop and remove duplicates which in turn modifies the list
	//this is what we dont wanna do, we want to perform on the list without modifying it
	Stream s= list.stream();
	/*s.distinct();//this returns a different stream which has distinct elements
	s.forEach(n->System.out.println(n));//we cannot do it like this as the stream would change which is not allowed so we have to store the function returns in a new stream
	*/
	Stream s1=s.distinct();
  s1.forEach(n->System.out.println(n));
//we cant use a already performed upon string again
}
}
