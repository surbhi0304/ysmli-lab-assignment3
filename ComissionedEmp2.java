package day3assignments;

public class ComissionedEmp2 extends Employee2 {
	private double weeklySale;
	private double rate;
	
	public ComissionedEmp2() {
		
	}

	public ComissionedEmp2( double weeklySale, double rate) {
		this.weeklySale = weeklySale;
		this.rate = rate;
	}

	public double getWeeklySale() {
		return weeklySale;
	}


	public double getRate() {
		return rate;
	}

	@Override
	public double getPayment() {
		return getSalary();
	}

	public void setWeeklySale(int weeklySale) {
		this.weeklySale = weeklySale;
	}

	@Override
	public void setSalary(double rate ) {
		this.rate= rate;
	}

	@Override
	public double getSalary() {
		return (getWeeklySale()*getRate());
	}

	@Override
	public String toString() {
		return "ComissionedEmp2 [weeklySale=" + weeklySale + ", rate=" + rate + " Salary="+ getPayment()+"]";
	}
	
	

}
