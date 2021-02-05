package day3assignments;

public class Application {
	public static void main(String[] args) {
		Payable payable;
		System.out.println("Invoice Class : ");
		payable=new Invoice("1275","engine",2,5000.0); 
		System.out.println("Result is : "+payable.toString());
		
		System.out.println("\nSalaried Employee Class : ");
		payable=new SalariedEmp2(3,7600.0); 
		System.out.println("Result is : "+payable.toString());
		
		System.out.println("\nHourly Employee Class : ");
		payable=new HourlyEmp2(6,1000.0); 
		System.out.println("Result is : "+payable.toString());
		
		System.out.println("\nCommission Employee Class : ");
		payable=new ComissionedEmp2(9, 10); 
		System.out.println("Result is : "+payable.toString());
	}

}
