package daythree.string;

public class StringOperation {

	public static void main(String[] args) {
		
		String hello= "Helleeo";
		System.out.println("Length of the string hello is: "+hello.length());
		System.out.println("char at index position 3 is: "+hello.charAt(3));
		System.out.println(hello.indexOf('e',2));
		System.out.println(hello.lastIndexOf('e',3));
		System.out.println(hello.codePointCount(2, 5));
		
		// ValueOf - converts data into string.
		int number = 12345;
		String numberString = String.valueOf(number);
		System.out.println(numberString);
		System.out.println(numberString instanceof String);
		
		//parse is use to convert String into int data.
		Integer num = Integer.parseInt(numberString);
		System.out.println(num instanceof Integer); 
		System.out.println(num*5);
		
//		String emptyString = null;
//		System.out.println(emptyString.isEmpty()); // it will throw an exception NullPointerException.
		
		String str = "     Hello Everyone !! x             ";
		System.out.println(str.strip()); //strip is only optimized 
		System.out.println(str.trim());  //trim creates new object and returns the string after removing spaces from leading and trailing.
		str = str.replaceAll(" ", ""); //to replacing all white space.
		System.out.println(str);
	}

}
