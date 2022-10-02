package p1;



import java.util.Scanner;

import p1.exception.InvalidOperatroException;
import p1.exception.InvalidValueException;



public class MainClass 
{

	public static void main(String[] args){

		try {
			check();
		}
		catch(InvalidOperatroException | InvalidValueException e)
		{
			System.out.println(e.getMessage());
		}
	}


	//@SuppressWarnings("resource")
	public static void check() throws InvalidOperatroException,InvalidValueException {
		Addd add= new Addd();
		Subb sub = new Subb();
		Mull mul = new Mull();
		Divv div = new Divv();
		Percentage per = new Percentage();



		while(true) { //for executing so many time until someone not giving exit option.
			Scanner scan = new Scanner(System.in);
			System.out.println("Select Option which you want to perform from below");
			System.out.println("1.+  2.-  3.* 4./  5.%  6.Exit");

			int select = scan.nextInt();

			if(select>=1 && select<=6)
			{
				System.out.println("Enter the first number:");
				int numberone = scan.nextInt();
				System.out.println("Enter the second number:");
				int numbertwo = scan.nextInt();
				if((numberone>Integer.MIN_VALUE&&numberone<Integer.MAX_VALUE)&&(numbertwo>Integer.MIN_VALUE&&numbertwo<Integer.MAX_VALUE)) 
				{		
					switch(select)
					{
					case 1:
					{

						System.out.println(add.addition(numberone, numbertwo));
					}
					break;
					case 2:
					{
						System.out.println(sub.substraction(numberone, numbertwo));
					}
					break;
					case 3:
					{
						System.out.println(mul.multiplication(numberone, numbertwo));
					}
					break;
					case 4:
					{
						System.out.println(div.division(numberone, numbertwo));
					}
					break;
					case 5:
					{
						System.out.println(per.percentage(numberone, numbertwo));
					}
					break;
					case 6: System.exit(0);
					System.out.println("Invalid Choice...");
					break;
					}
				}
				else {
					throw new InvalidValueException("Invalid Value Entered");
				}
			}
			else {

				throw new InvalidOperatroException("Invalid Choice Entered..");


			}
		}
	}
}



