package WOTS;


public class StockOrder {
	
	private int orderID;
	private String orderStatus;
	private String employeeName;
	private String productName;
	private int quantity;
	private String supplier;
	private double subTotal;
	
	public StockOrder(int vOrderID, String vOrderStatus, String vEmployeeName, String vProductName, int vQuantity, String vSupplier, double vSubtotal)
	{
		this.orderID=vOrderID;
		this.orderStatus=vOrderStatus;
		this.employeeName=vEmployeeName;
		this.productName=vProductName;
		this.quantity=vQuantity;
		this.supplier=vSupplier;
		this.subTotal=vSubtotal;
	}

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

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

}
