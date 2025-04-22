package regexbabyyyyyyyyyyy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhoneNumberValidation {

	public static void main(String[] args) {
		String regex = "^(?:\\+91|91|0)?[6789]\\d{9}";
		String text = "7538203920,7896543256";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);
		while (matcher.find()) {
			System.out.println(matcher.group() + " " + matcher.start());

		}
	}
}