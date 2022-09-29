package daythree.string;

import java.util.Objects;

public class Employee {
	private Integer empId;
	private String firstName;
	private String lastName;
	private String department;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId);
	}
	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return Objects.equals(empId, other.empId);
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", department="
				+ department + "]";
	}
	
	
}
