package junitexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrength {
public static void invalidPassword(String str)
{
	String regex ="^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[&@#$^!*])[a-zA-Z0-9$&^#@*!]{8,}$";//?= is a positive lookahead which says that this symbols can be contained anywhere in the string

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
public static void main(String[] args) {
	String a = 	"Kanchan@200213*";
	invalidPassword(a);
}
}

