package p2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pattern1 {
	public static void main(String[] args) {
		String regex="^[5]$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher("1");
		System.out.println(matcher.matches());
	}
}
