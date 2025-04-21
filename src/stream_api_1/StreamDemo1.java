package stream_api_1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class StreamDemo1 {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,2,5,6);
OptionalDouble optional=  list.stream().mapToInt(Integer::intValue).average();
 System.out.println(optional);
 List<String> list1 = Arrays.asList("ab","ahhdhdj","jjjs","skaklalo");

}
}
