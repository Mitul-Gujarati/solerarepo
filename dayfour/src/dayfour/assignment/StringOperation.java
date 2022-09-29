package dayfour.assignment;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringOperation {
	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("[A-Z]+[0-9]+");
		Matcher m = p.matcher("ABC123");
		boolean matches = m.matches();
		if(matches)
		{
			System.out.println("It Contains String as Well as");
		}
		else {
			System.out.println("it contains string only");
		}

		System.out.println(Pattern.compile("\\d").matcher("4").matches());

		//		String str="A56BC123";
		//		String[] charArray = str.split("\\d+");
		//		for (int i = 0; i < charArray.length; i++) {
		//			System.out.print(charArray[i]);
		//		}
	}
}
