package dayone.helloworld;

import java.time.LocalDate;

public class Employee {
	private int empId;
	private String name;
	private double salary;
	private LocalDate dob; //LocalDate is predefined class present in java.time package which is use to perform operation related to dates.
	
	private Address address;  //Has-A relationship.
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", salary=" + salary + ", dob=" + dob + ", address="
				+ address + "]";

	}
}
