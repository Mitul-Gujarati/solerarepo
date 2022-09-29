package Assignment;

import java.util.Scanner;

public class AddTwoMatrix {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		//First Matrix From User.
		System.out.println("enter the number of rows: ");
		int row = scan.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = scan.nextInt();
		int[][] nums = new int[row][cols];
		System.out.println("Enter the numbers:");
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < cols; j++) 
			{
				nums[i][j]=scan.nextInt();
			}
		}
		
		//Second Matrix From User.
		System.out.println("enter the number of rows for second matrix: ");
		int row2 = scan.nextInt();
		System.out.println("Enter the number of columns for second matrix: ");
		int cols2 = scan.nextInt();
		int[][] nums2 = new int[row2][cols2];
		System.out.println("Enter the numbers:");
		for (int i = 0; i < row2; i++) 
		{
			for (int j = 0; j < cols2; j++) 
			{
				nums2[i][j]=scan.nextInt();
			}
		}
		if(row==row2 && cols==cols2)
		{	
			int[][] result = new int[row][cols];
			for (int i = 0; i < row; i++) 
			{
				for (int j = 0; j < cols2; j++) 
				{
					result[i][j]=nums[i][j]+nums2[i][j];
				}
			}

			System.out.println("First Matrix: ");

			for (int i = 0; i < row; i++) 
			{
				for (int j = 0; j < cols; j++) 
				{
					System.out.print(nums[i][j]+" ");
				}
				System.out.println("");
			}

			System.out.println("Second Matrix: ");

			for (int i = 0; i < row2; i++) 
			{
				for (int j = 0; j < cols2; j++) 
				{
					System.out.print(nums2[i][j]+" ");
				}
				System.out.println("");
			}

			System.out.println("Result Matrix After Adding Two Matrix: ");
			for (int i = 0; i < row; i++) 
			{
				for (int j = 0; j < cols; j++) 
				{
					System.out.print(result[i][j]+" ");
				}
				System.out.println("");
			}

			scan.close();
		}
		else {
			System.out.println("For Addition OF Two Matrix Both Matrix Are In Same Dimension");
		}
	}
}