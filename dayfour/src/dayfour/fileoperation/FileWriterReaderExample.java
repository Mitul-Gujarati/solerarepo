package dayfour.fileoperation;

import java.io.*;

public class FileWriterReaderExample {

	public static void main(String[] args) 
	{
		File file = new File("D:\\File\\second.txt");

		//		first checking file is already exist or not
		//		if file is already exist than execute else block
		//		if file is not exist than execute if block and invoke createNewFile() method for creating empty file.
		if(!file.exists())
		{
			try 
			{
				file.createNewFile();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		else 
		{
			System.out.println("File Already Exist");
		}


		
		try
		{
			//writing data into file using FileWriter class.
			FileWriter fw = new FileWriter(file);
			fw.write("Hello, How Are You....");
			fw.close(); //closing the writing of file.

			//reading data from file using FileReader class.
			FileReader fr = new FileReader(file);
			int i=0;
			while((i=fr.read())!=-1)
			{
				System.out.print((char)i);
			}
			fr.close(); //closing the reading file.
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}