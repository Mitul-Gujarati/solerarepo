package p1.runtimepoly;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import p1.Addd;
import p1.Divv;
import p1.Mull;
import p1.Percentage;
import p1.ScintificOp;
import p1.Subb;

public class CalculatorLogic {
	public static void main(String[] args) {
		boolean x= true;
		//this loop or calculator running till user stop the calculator explicitly by writing stop command.
		while(x==true) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("In this calculator you can perform Arithmatic,Scientific and trigonometric operations.");
			System.out.println("Enter the operation which you want to perform");
			
			//taking input from user in the form of string.
			String input=sc.nextLine();
			
			//Spliting String array with space.
			String s[] = input.split(" ");
			
			//Storing every string array element into list
			List<String> l=new ArrayList<>();
			
			//Performing Scientific and trigonometric operation with help of enums.
			for(int i=0;i<s.length;i++) {
				if (s[i].equals(ScintificOp.abs.name())) {
					l.add(String.valueOf(Math.abs(Double.parseDouble(s[i + 1]))));
					i = i + 1;
				}
				else if(s[i].equals(ScintificOp.sqrt.name())){
					l.add(String.valueOf(Math.sqrt(Double.parseDouble(s[i + 1]))));
					i = i + 1;
				}
				else if(s[i].equals(ScintificOp.sin.name())){
					l.add(String.valueOf(Math.sin(Double.parseDouble(s[i + 1]))));
					i = i+1;
				}
				else if(s[i].equals(ScintificOp.cos.name())){
					l.add(String.valueOf(Math.cos(Double.parseDouble(s[i + 1]))));
					i = i+1;
				}
				else if(s[i].equals(ScintificOp.tan.name())){
					l.add(String.valueOf(Math.tan(Double.parseDouble(s[i + 1]))));
					i = i+1;
				}
				else if(s[i].equals(ScintificOp.stop.name())){
					x=false;
					System.out.println("Your calculator was stopped.");
				}
				else
					l.add(s[i]);
			}
			basic(l);
		}
	}

	//Performing Simple Arithmetic Operation,with help of Interface and it's implementation classes. 
	public static void basic(List<String> exp){

		Addd add = new Addd();
		Subb sub = new Subb();
		Mull mul = new Mull();
		Divv div = new Divv();
		Percentage per = new Percentage();
		double result=0;
		for (int i = 1; i < exp.size() - 1; i = i + 2) {
			int counter = 0;
			counter = i;
			double res1 = 0;
			int number1 = 0;
			int number2 = 0;
			double num3 = 0;
			if (i == 1) {
				number1 = Integer.parseInt(exp.get(counter-1));
				number2 = Integer.parseInt(exp.get(counter+1));
				if (exp.get(i).equals("+")) {
					res1 = add.addition(number1, number2); //Addition
				} else if (exp.get(i).equals("-")) {
					res1 = sub.substraction(number1, number2); //Subtraction
				} else if (exp.get(i).equals("*")) {
					res1 = mul.multiplication(number1, number2); //Multiplication
				} else if (exp.get(i).equals("/")) {
					res1 = div.division(number1, number2); //division
				}else if (exp.get(i).equals("%")) {
					res1 = per.percentage(number1, number2); //Percentage
				}
				result += res1;
			} else {
				num3 = Double.parseDouble(exp.get(counter+1));
				if (exp.get(i).equals("+")) {
					result = result + num3;
				} else if (exp.get(i).equals("-")) {
					result = result - num3;
				} else if (exp.get(i).equals("*")) {
					result = result * num3;
				} else if (exp.get(i).equals("/")) {
					result = result / num3;
				}
				result += res1;
			}
			System.out.println("Your Result is: "+result);
		}

		System.out.println("If you want to stop the calculator write stop.");
	}
}
