package daytwointerfaceexample;

public class CalculateAreaImpl implements CalculateArea{
	//giving body of the abstract method of interface.
	public int calculateArea(int length,int breadth)
	{
		return length*breadth;
	}
	
	//adding additional method in implementation class.
	void view()
	{
		System.out.println("I am view method of implemention class.");
	}
}
