package Assignment;

import java.util.*;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Total Number of Student:");
		int numberOfStudent = sc.nextInt();
		ArrayList<Student> t = new ArrayList<Student>();
		
		while(numberOfStudent!=0) 
		{
			System.out.println("Enter id,fname,cgpa:");
			int id = sc.nextInt();
			String fname=sc.next();
			double cgpa = sc.nextDouble();
			Student student = new Student(id, fname, cgpa);
			t.add(student);
			numberOfStudent--;
		}
		sc.close();
		t.sort(new SortStudentByCgpa()); //sorting the ArrayList.
		for (Student student : t) {
			System.out.println(student);
		}
	}
}
