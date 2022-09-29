package dayone.helloworld;

import java.time.LocalDate;

public class HrmsApp {
	public static void main(String[] args) {

		Employee employee = new Employee();
		Address address = new Address();

		address.setId(1);
		address.setStreet("Billekahli");
		address.setCity("Bengaluru");
		address.setState("Karnataka");
		address.setCountry("India");

		employee.setEmpId(125);
		employee.setName("Mitul");
		employee.setSalary(50000.00);
		employee.setDob(LocalDate.now());
		employee.setAddress(address);

		System.out.println(employee);
	}
}
