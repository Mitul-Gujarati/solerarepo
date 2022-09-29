package daytwointerfaceexample;

/*
 * An Enum is a group of predefined named constants in any programming language.
 * Enum is used when we know all possible values of the group before compiling the code.
 * Example: Direction can be an enum as we know all possible values of direction that can be NORTH, SOUTH, EAST, and WEST.
 * Over the course of development, we may add a few new enum constants.
 * Enums are very powerful as they may have instance variables, instance methods, and constructors.
 * Each enum constant should be written in capital letters.
 * Every enum constant is by default internally public static final of type Enum declared.
 *Enum can be declared outside a class or inside a class but cannot be declared inside a method. 
 *In Enum , constants must be declared first and then instance variables , constructors and methods .
 */
enum Direction{
	NORTH,
	SAUTH,
	WEST,
	EAST;
}

public class EnumExample {
	public static void main(String[] args) {

		System.out.println(Direction.NORTH);
		System.out.println("Index of WEST: "+Direction.WEST.ordinal()); // ordinal() returns index of enum constant .
		
		for(Direction direction : Direction.values()) //values() return an array of all enum objects.
		{
			System.out.println("Direction is: "+direction);
		}
	}
}
