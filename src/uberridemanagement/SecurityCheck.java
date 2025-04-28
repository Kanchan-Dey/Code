package uberridemanagement;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Retention(RetentionPolicy.RUNTIME) // Make it available at runtime
@Target(ElementType.TYPE)
public @interface SecurityCheck {


		  String role();
		  
	}

