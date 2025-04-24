package annotationsss;

import java.lang.reflect.Method;

public class Annotattionss {
	 public static void main(String[] args) throws Exception {
	        MyService service = new MyService();
	        Class<?> clazz = service.getClass();

	        for (Method method : clazz.getDeclaredMethods()) {
	            if (method.isAnnotationPresent(Info.class)) {
	                Info info = method.getAnnotation(Info.class);
	                System.out.println("Method: " + method.getName());
	                System.out.println("  Name: " + info.name());
	                System.out.println("  Version: " + info.version());
	            }
	        }
	    }
}
