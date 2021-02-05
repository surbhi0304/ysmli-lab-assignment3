package day3assignments;

public class SalariedEmployee extends Employee{
	private int NoOfweek;
	private double weeklySalary;

	public SalariedEmployee() {

	}

	public SalariedEmployee(String empName, String empID, int noOfweek, double weeklySalary) {
		super(empName, empID);
		this.NoOfweek = noOfweek;
		this.weeklySalary = weeklySalary;
	}

	public int getNoOfweek() {
		return NoOfweek;
	}

	public void setNoOfweek(int noOfweek) {
		NoOfweek = noOfweek;
	}

	public double getWeeklySalary() {
		return weeklySalary;
	}

	public void setWeeklySalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double calculateSalary() {
		return (getNoOfweek()*getWeeklySalary());
	}

}
