package task;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

		Operation operation = new Operation();

		while(true) { //for executing so many time until someone not giving exit oprion.
			Scanner scan = new Scanner(System.in);
			System.out.println("Select Option which you want to perform from below");
			System.out.println("1.Add(+)  2.Sunstraction(-)  3.Multiplication(*) 4.Division(/)  5.Modules(%)  6.Exit");
			int select = scan.nextInt();

			switch(select)
			{
			case 1:
			{
				System.out.println("Enter the first number:");
				int numberone = scan.nextInt();
				System.out.println("Enter the second number:");
				int numbertwo = scan.nextInt();
				operation.addition(numberone, numbertwo);
			}
			break;
			case 2:
			{
				System.out.println("Enter the first number:");
				int numberone = scan.nextInt();
				System.out.println("Enter the second number:");
				int numbertwo = scan.nextInt();
				operation.substraction(numberone, numbertwo);
			}
			break;
			case 3:
			{
				System.out.println("Enter the first number:");
				int numberone = scan.nextInt();
				System.out.println("Enter the second number:");
				int numbertwo = scan.nextInt();
				operation.multiplication(numberone, numbertwo);
			}
			break;
			case 4:
			{
				System.out.println("Enter the first number:");
				int numberone = scan.nextInt();
				System.out.println("Enter the second number:");
				int numbertwo = scan.nextInt();
				operation.division(numberone, numbertwo);
			}
			break;
			case 5:
			{
				System.out.println("Enter the first number:");
				int numberone = scan.nextInt();
				System.out.println("Enter the second number:");
				int numbertwo = scan.nextInt();
				operation.modulus(numberone, numbertwo);}
			break;
			case 6: System.exit(0);
			default : System.out.println("Invalid Choice...");
			break;
			}
			scan.close();
		}
	}
}
