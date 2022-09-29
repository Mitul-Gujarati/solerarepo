package Assignment;

import java.util.Scanner;

public class twoDArray {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the number of rows: ");
		int row = scan.nextInt();
		System.out.println("Enter the number of columns: ");
		int cols = scan.nextInt();
		int[][] nums = new int[row][cols];
		if(row<10 && cols<10)
		{
			System.out.println("Enter the numbers:");
			{
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < cols; j++) {
						nums[i][j]=scan.nextInt();
					}
				}
				scan.close();
				for (int i = 0; i < row; i++) {
					for (int j = 0; j < cols; j++) {
						if(nums[i][j]%2!=0)
						{
							System.out.print(nums[i][j]+" ");
						}
					}
				}
			}
		}
		else
		{
			System.out.println("Rows And Columns must be less than 10.");
		}
	}
}
