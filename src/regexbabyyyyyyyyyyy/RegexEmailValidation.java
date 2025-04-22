package regexbabyyyyyyyyyyy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmailValidation {
	public static void main(String[] args) {
		String regex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z]+\\.[a-zA-Z]{2,6}$";// ^ says that it can start with, + mentions that
																		// it can occur once or many times, $ says that
																		// it should end with a word within the range 2
																		// to 6 from the braces before it, to make the .
																		// print outside the braces without being
																		// considered a regex we use the \\
		String email = "kanchan12dey@gmail.com";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		if (matcher.find()) {
			System.out.println(matcher.group() + " " + matcher.start());

		} else {
			System.out.println("match not found");
		}
	}
}
