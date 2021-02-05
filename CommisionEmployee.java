package day3assignments;

public class CommisionEmployee extends Employee {
	private int weeklySale;
	private int rate;
	
	public CommisionEmployee() {
		
	}

	public CommisionEmployee(String empNmae, String empID, int weeklySale, int rate) {
		super(empNmae, empID);
		this.weeklySale = weeklySale;
		this.rate = rate;
	}

	public int getWeeklySale() {
		return weeklySale;
	}

	public void setWeeklySale(int weeklySale) {
		this.weeklySale = weeklySale;
	}

	public int getRate() {
		return rate;
	}

	public void setRate(int rate) {
		this.rate = rate;
	}

	@Override
	public double calculateSalary() {
		return ((getWeeklySale()*getRate())/100);
	}
	
	

}
