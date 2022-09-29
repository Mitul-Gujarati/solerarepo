package dayfour.fileoperation;

import java.io.*;

/*
 * RandomAccessFile is used for read and write data in particular position
 * it read by default bytes format.
 * seek() is change the position of cursor.
 * getBytes() is used to convert data into byte format. 
 * */

public class RandomAccessFileExample {

	private static void writeToFile(String filePath, String data ,int position)
	{
		File file = new File(filePath);
		
		try 
		{
			//writing data using RandomAccessFile.
			RandomAccessFile random = new RandomAccessFile(file, "rw");
			random.seek(position);
			random.write(data.getBytes());//converting String data to byte using getBytes() method.
			random.close();
		} catch (Exception e) 
		{

			e.printStackTrace();
		}
	}

	private static void readToFile(String filePath, int position ,int size)
	{
		File file = new File(filePath);

		try 
		{
			//reading data from RandomAccessFile.
			RandomAccessFile random = new RandomAccessFile(file, "r");
			
			random.seek(8); //starting position for reading file is we give 8.
			
			byte[] bytes = new byte[size]; //we created byte array for storing and printing the content and size is use pass how many character he wants to print. 
			random.read(bytes); //reading byte array.in this array characters are stored which user can pass length.
			System.out.println(new String(bytes)); //for printing the byte array.
			random.close();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	public static void main(String[] args) 
	{

		String filePath = "D:\\File\\second.txt";
		String data = "Will take break after this example";

		int position = 5;
		int size =10;

		writeToFile(filePath, data, position);

		readToFile(filePath, position, size);
	}

}

