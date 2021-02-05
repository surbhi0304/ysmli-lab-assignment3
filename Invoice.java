package day3assignments;

public class Invoice implements Payable{
	private String partNum;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	public Invoice() {

	}

	public Invoice(String partNum, String partDescription, int quantity, double pricePerItem) {

		this.partNum = partNum;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}

	public String getPartNum() {
		return partNum;
	}

	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricePerItem() {
		return pricePerItem;
	}

	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;

	}

	@Override
	public double getPayment() {
		return(getQuantity()*getPricePerItem());
	}

	@Override
	public String toString() {
		return "Invoice [partNum=" + partNum + ", partDescription=" + partDescription + ", quantity=" + quantity
				+ ", pricePerItem=" + pricePerItem + " Salary="+ getPayment()+"]";
	}
	
	

}
