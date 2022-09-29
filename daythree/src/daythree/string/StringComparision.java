package daythree.string;

/*
 * In java The String class includes various methods that compare strings or substrings within each string. The most popularly used two ways to compare the strings is either using = = operator or by using the equals method.
The equals() method compares the characters inside a String object. The = = operator compare two object references to see whether they refer to the same instance. The program above shows the difference between the two*/

public class StringComparision {
	public static void main(String[] args) {
		String str = new String("Hello");
		String s ="Hello";
		String s1 = new String("Hello");
		
		System.out.println(str == s); //it compares object reference
		System.out.println(str.equals(s)); //it compares the content of an object.
		
		System.out.println(str==s1);
		System.out.println(str.equals(s1));
	}
}
