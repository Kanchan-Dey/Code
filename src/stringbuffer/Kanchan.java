package stringbuffer;

public class Kanchan {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("BABY");//adding data from the end
		sb.append(" " +true);
		System.out.println(sb);
		StringBuffer sb1= new StringBuffer("hello world");
		System.out.println(sb1);
		sb1.delete(0, 6);
		System.out.println(sb1);
		StringBuffer sb2= new StringBuffer(20);
		char[] arr = {'a','b','c'};
		sb2.append(arr);//adding data from the end
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		sb2.ensureCapacity(24);
		System.out.println(sb2.capacity());//oldcapacity*2)+23
	   sb.insert(1, false);
	   System.out.println(sb);
	}
}
