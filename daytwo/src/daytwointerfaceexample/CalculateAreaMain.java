package daytwointerfaceexample;

public class CalculateAreaMain {
	public static void main(String[] args) {

		CalculateArea area = new CalculateAreaImpl();
		System.out.println("Area method of interface: "+area.calculateArea(5, 2)); //it can take overridden method body.
		System.out.println("Perimiti method of iterface: "+area.calculatePerimiti(5, 2));
		CalculateArea.display();
		//area.view(); //cal.display(); it's thrown an error because we cannot use reference of Interface type for accessing implementation class members,for writing line number 6.

		CalculateAreaImpl cal = new CalculateAreaImpl();
		System.out.println("Area method of implemntion class: "+cal.calculateArea(10, 25));
		cal.view();
		//cal.display(); it's thrown an error because we cannot use reference of implementation class for accessing interface members,for writing line number 11.	

		//giving body of abstract method of interface using anonymous class. 
		CalculateArea calculate = new CalculateArea() { // here CalculateArea is an interface.

			@Override
			public int calculateArea(int length, int breadth) {
				return length*length;
			}
		};
		System.out.println("giving body and Accessing abstract method of an interface using anonymous class: "+calculate.calculateArea(5, 25));
	}
}
