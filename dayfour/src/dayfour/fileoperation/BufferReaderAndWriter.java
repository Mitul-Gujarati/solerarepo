package dayfour.fileoperation;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderAndWriter {
	public static void main(String[] args) {
		
		try 
		{
			FileWriter fw = new FileWriter("D:\\File\\second.txt");
			BufferedWriter bfw = new BufferedWriter(fw);
			bfw.write("Good noon");
			bfw.close();
			
			
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}
}
