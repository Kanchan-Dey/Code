package regexbabyyyyyyyyyyy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPasswordValidation {
 public static void main(String[] args) {
	String regex ="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[&@#$^!*])[a-zA-Z0-9$&^#@*!]{8,}$";//?= is a positive lookahead which says that this symbols can be contained anywhere in the string
	String str ="Kanchan@200213*";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(str);
	if(matcher.find())
	{
		
		System.out.println(matcher.group());
	}
	else
	{
		System.out.println("Invalid password");
	}
	
}
}
//^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z0-9!@#$%^&*]{8,}$);