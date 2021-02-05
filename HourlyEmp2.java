package day3assignments;

public class HourlyEmp2 extends Employee2{
	private int noOfHours;
	private double hourlyRate;
	public HourlyEmp2 () {
		
	}
	
	public HourlyEmp2 (int noOfHours, double hourlyRate) {
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
	
	@Override
	public double getPayment() {
		return getSalary();
	}

	@Override
	public void setSalary(double hourlyRate ) {
		this.hourlyRate= hourlyRate;
	}

	@Override
	public double getSalary() {
		return (getNoOfHours()*getHourlyRate());
	}

	@Override
	public String toString() {
		return "HourlyEmp2 [noOfHours=" + noOfHours + ", hourlyRate=" + hourlyRate +" Salary="+ getPayment()+"]";
	}
	
	

}
