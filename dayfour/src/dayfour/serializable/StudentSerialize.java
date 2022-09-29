package dayfour.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentSerialize {
	public static void main(String[] args) {
		Student student = new Student();
		student.setStudentId(1);
		student.setStudentName("Tom");

		System.out.println(student);

		File file = new File("D:\\File\\serializable.txt");

		try 
		{
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(student);
			oos.close();
			fos.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}

		Student student1;
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			student1 = (Student) ois.readObject();
			System.out.println("Decentralized object ---"+student);
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
