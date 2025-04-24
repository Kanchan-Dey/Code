package annotationsss;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
@Retention(RetentionPolicy.RUNTIME) // Make it available at runtime
@Target(ElementType.METHOD)
public @interface Info {
	  String name();
	    double version() default 1.0;
}
