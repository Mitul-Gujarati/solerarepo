package Assignment;

import java.util.Comparator;

public class SortStudentByCgpa implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		if(o2.getCgpa() == o1.getCgpa())
		{
			if(o2.getFname().equals(o1.getFname()))
			{
				return o1.getId() - o2.getId();
			}
			else{
				return o1.getFname().compareTo(o2.getFname());
			}
		}
		else {
			return o2.getCgpa().compareTo(o1.getCgpa());
		}
	}
}
