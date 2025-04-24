package regexbabyyyyyyyyyyy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidatorPractice {
public static void main(String[] args) {
	String email="KaNchan1*";
	String regex = "(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z0-9!@#$%^&*]{8,30}$";
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher= pattern.matcher(email);
	if(matcher.find())
	{
		System.out.println(matcher.group());
	}
	else
	{
		System.out.println("Invalid email");
	}
}
}
