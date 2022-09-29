package Assignment;

import java.util.Scanner;

public class EvenNumberOfArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Enter the numbers:");
		for(int index=0;index<10;index++)
		{
			array[index]=scan.nextInt();
		}
		scan.close();
		for(int index=0;index<10;index++)
		{
			if(array[index]%2==0)
			{
				System.out.print(array[index]+" ");
			}
		}
	}

}
