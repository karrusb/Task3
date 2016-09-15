package WOTS;


public class Order {
	
	private int orderID;
	private String orderStatus;
	private String firstName;
	private String surname;
	private double subTotal;
	private boolean dispatched;
	private boolean workedOn;
	
	//Order object
	
	public Order(int vOrderID, String vOrderStatus, String vFirstName, String vSurname, double vSubtotal, boolean vDispatched, boolean vworkedOn)
	{
		this.orderID=vOrderID;
		this.orderStatus=vOrderStatus;
		this.firstName=vFirstName;
		this.surname=vSurname;
		this.subTotal=vSubtotal;
		this.dispatched=vDispatched;
		this.workedOn=vworkedOn;
	}
	
	//GETTERS AND SETTERS
	
	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public boolean isDispatched() {
		return dispatched;
	}
	public boolean isWorkedOn() {
		return workedOn;
	}

	public void setDispatched(boolean dispatched) {
		this.dispatched = dispatched;
	}
	
	public void setWorkedOn(boolean workedOn) {
		this.workedOn = workedOn;
	}

	
	
	
	
}