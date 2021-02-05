package day3assignments;

public abstract class Employee {
	private String empName;
	private String empID;
	
	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public Employee() {
		empName="default";
		empID= "EMP0000";
	}
	
	public Employee(String empName, String empID) {
		this.empName = empName;
		this.empID = empID;
	}
	
	abstract public double calculateSalary();
}
