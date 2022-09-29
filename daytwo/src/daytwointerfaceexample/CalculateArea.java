package daytwointerfaceexample;

public interface CalculateArea {
	//simple abstract method 
	public int calculateArea(int length,int breadth);
	
	//after java-8 we can write default method in interface.
	default int calculatePerimiti(int length,int breadth)
	{
		return length+breadth;
	}
	
	//after java-8 we can write static method in interface. 
	static void display()
	{
		System.out.println("I am static method of interface.");
	}
}
