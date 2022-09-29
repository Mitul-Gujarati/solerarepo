package daythree.string;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee empplyee1 = new Employee();
		Employee empplyee2 = new Employee();
		
		empplyee1.setEmpId(1);
		empplyee2.setEmpId(1);
		
		System.out.println(empplyee1 == empplyee2);
		System.out.println(empplyee1.equals(empplyee2)); //we already overrided equals method. 
		System.out.println(empplyee1.hashCode());
		System.out.println(empplyee2.hashCode());
	}
}
