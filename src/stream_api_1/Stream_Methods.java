package stream_api_1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Stream_Methods {
public static void main(String[] args) {
	List<Integer>list = Arrays.asList(1,1,1,1,1,1,1,2);
	System.out.println(list);
	//to print only the uniques we usually would make a loop and remove duplicates which in turn modifies the list
	//this is what we dont wanna do, we want to perform on the list without modifying it
	/*Stream s= list.stream();
	/*s.distinct();//this returns a different stream which has distinct elements
	s.forEach(n->System.out.println(n));//we cannot do it like this as the stream would change which is not allowed so we have to store the function returns in a new stream
	
	Stream s1=s.distinct();
  s1.forEach(n->System.out.println(n));*/
//we cant use a already performed upon string again
  //now we write it in one line with constructor chaining
	list.stream().distinct().forEach(n->System.out.println(n));//this is a example of pipelining
    //using the lambda function we are actually writing the body of the accept(T t) in Consumer interface
	//in Demo demo =()->sop("hello"); . demo is a reference variable so it should store a method returned but an interface cannot have an object so we use lambda which creates an anonymous class with anonymous method which has a body
	// so when we write this , the demo refers to the anonymous method in anonymous class
	Optional<Integer> optional= list.stream().distinct().min((o1,o2)->o1-o2);

 if(optional.isPresent())
 {
	 System.out.println(optional.get());
 }
 
 Integer i = list.stream().max((o1,o2)->o1-o2).get();
 System.out.println(i);
}
}
