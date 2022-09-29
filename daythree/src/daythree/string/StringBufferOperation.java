package daythree.string;

public class StringBufferOperation {
	public static void main(String[] args) {

		StringBuffer sb =  new StringBuffer("Hello");
		
		System.out.println(sb);
		
		System.out.println(sb.capacity());  //by default capacity is 16.InShort by default we can add only 16 characters.
		
		sb= sb.append("Good Afternoon gfnsdjg"); //Incremental Capacity => (old capacity*2)+2
		System.out.println(sb);
		
		System.out.println(sb.capacity());
		
		System.out.println(sb.reverse());

	}
}
