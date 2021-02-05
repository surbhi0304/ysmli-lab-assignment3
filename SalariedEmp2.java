package day3assignments;

public class SalariedEmp2 extends Employee2{
	private int NoOfweek;
	private double weeklySalary;

	public SalariedEmp2() {

	}

	public SalariedEmp2(int noOfweek, double weeklySalary) {
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

	@Override
	public double getPayment() {
		return getSalary() ;
	}

	@Override
	public void setSalary(double weeklySalary) {
		this.weeklySalary = weeklySalary;
	}

	@Override
	public double getSalary() {
		return (getNoOfweek()*getWeeklySalary());
	}

	@Override
	public String toString() {
		return "SalariedEmp2 [NoOfweek=" + NoOfweek + ", weeklySalary=" + weeklySalary + " Salary="+ getPayment()+"]";
	}
	
	

}
