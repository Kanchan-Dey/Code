package regexbabyyyyyyyyyyy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
public static void main(String[] args) {
	String str = "<h1>hello</h1>";
	String regex ="[<[A-Za-z0-9]>][.][</[A-Za-z0-9]>]";//^ matches any character other than this.
	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(str);//\\d would match any character
	while(matcher.find()) {
		System.out.print(matcher.group());
	}
	
}
}
