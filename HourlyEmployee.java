package day3assignments;

public class HourlyEmployee extends Employee{
	private int noOfHours;
	private double hourlyRate;
	public HourlyEmployee() {
		
	}
	
	public HourlyEmployee(String empNmae, String empID, int noOfHours, double hourlyRate) {
		super(empNmae, empID);
		this.noOfHours = noOfHours;
		this.hourlyRate = hourlyRate;
	}

	public int getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public double calculateSalary() {
		return (getNoOfHours()*getHourlyRate());
	}
	

}
