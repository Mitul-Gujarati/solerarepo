package dayfour.fileoperation;

import java.io.*;

public class FileInpitStreamExample 
{
	public static void main(String[] args) {

		//writing into file with the help of FileOutputStream in byte format.
		String word = "Good Morning everyone hope you had a wonderfull day";
		try(FileOutputStream fis = new FileOutputStream("D:\\File\\hello.txt.txt"))
		{
			fis.write(65);
			fis.write(66);
			byte bArr[] =word.getBytes(); //converting string into byte array.
			fis.write(bArr); //writing byte array into file.
			fis.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		//reading from file with the help of FileInputStream in byte format.here we use type casting from int to character.
		try(FileInputStream first = new FileInputStream("D:\\File\\hello.txt.txt");) 
		{
			int i=0;
			while((i=first.read())!=-1)
			{
				System.out.print((char)i);
			}
		} 
		catch (IOException e1) 
		{
			e1.printStackTrace();
		}
	}
}
