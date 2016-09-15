package WOTS;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class CreateOrder {
	
	private int ordNum;
	
	private ArrayList<Order> custOrder;
	private ArrayList<StockOrder> stockOrder;
	
	/**
	 *	Menu displayed to user with 2 options
	 *
	 */
	
	public void orderMenu()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Press 1 for Customer Orders");
		System.out.println("Press 2 to place Stock Order");
		int menuItem = s.nextInt();
		
		if (menuItem == 1)
				{
					orderArray();
				}
		if (menuItem == 2)
				{
					stockOrder();
				}
		s.close();
		
	}
	
	/**
	 *	Function generates a stock order 
	 *
	 */
	
	public void stockOrder()
	{
		stockOrder = new ArrayList<StockOrder>();
		Scanner s = new Scanner(System.in);
		System.out.println("1 = Item 1");
		System.out.println("2 = Item 2");
		System.out.println("3 = Item 3");
		System.out.println("Select Item To Add To Order");
		int orderItem = s.nextInt();
		
		StockOrder s1 = new StockOrder(1, "In Stock", "Jim", "Product 1" , 200, "Supplier1", 499.99);
		StockOrder s2 = new StockOrder(2, "In Stock", "Benjamin", "Product 2" , 11, "Supplier2", 14.99);
		StockOrder s3 = new StockOrder(3, "In Stock", "Jackson", "Product 3" , 75, "Supplier3", 154.99);
		
		
	}
	
	/**
	 *	Function stores the customer orders in an ArrayList and then then passes the selected order  
	 *	to the print order function.
	 */
	
	public void orderArray()
	{
		Order o1 = new Order(1, "packed", "Harold", "Simpson", 32.99, true, true);
		Order o2 = new Order(2, "packed", "Paul", "Marklin", 79.99, true, false);
		Order o3 = new Order(3, "picked", "Stephanie", "Cryer", 6.00, false, true);
		
		custOrder = new ArrayList<Order>();
		String updateOrder ="";
		custOrder.add(o1);
		custOrder.add(o2);
		custOrder.add(o3);
	
		printOrders();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter an order number");
	
		int ordNum = s.nextInt();
		selectOrder(ordNum);
		boolean finished = true;
		while(finished)
		{
		System.out.println("Update Order? (Yes/No)");
		updateOrder = s.next();
		if(updateOrder.toUpperCase().equals("YES")|| updateOrder.toUpperCase().equals("NO"))
		{
			finished = false;
		}
		if(updateOrder.toUpperCase().equals("Y")|| updateOrder.toUpperCase().equals("N"))
		{
			finished = false;
		}
		if(finished)
		{
			System.out.println("invalid entry please try again");
		}
		}
		updateOrder(updateOrder, ordNum);
		s.close();
	}
	
	/**
	 *	Function takes the variable passed from the orderarray and then prints the order.
	 *
	 */
	
	private void printOrders()
	{
		for(Order orders : custOrder)
		{
			System.out.println("Order ID: "+ orders.getOrderID() +"\t"+ orders.getFirstName() +"\t"+ orders.getSurname()+"\t"+ orders.isWorkedOn());
		
			System.out.println("\n");
		}
		
		
	}
	
	/**
	 *	Function enables the user to update the order status to checked out.
	 *
	 */
	
	private void updateOrder(String updateOrder, int ordNum)
	{
		for ( Order orders : custOrder)
		{
			if (orders.isWorkedOn() == false)
			{
				orders.setWorkedOn(true);
				System.out.println(orders.getOrderID() +"\t"+ orders.getFirstName() +"\t"+ orders.getSurname()+"\t"+"\t"+ orders.getSubTotal() +"\t"+ orders.isDispatched()+ "\t"+ orders.isWorkedOn());
			}
		}
	}
	
	private void selectOrder(int orderID)
	{
		this.ordNum = orderID;
		
		for ( Order orders : custOrder)
		{
			if (orderID == orders.getOrderID())
			{
				System.out.println("Order ID" +"\t"+ "First Name" +"\t"+ "Surname" +"\t"+"Subtotal" +"\t"+ "Order Dispatched?"+"\t"+ "Being Worked On?");
				
				System.out.println("\n");
				                                                                                                                                                                                                                                                                                                                                                                                                                                        
				System.out.println(orders.getOrderID() +"\t"+ orders.getFirstName() +"\t"+ orders.getSurname() +"\t"+ orders.getSubTotal() +"\t"+ orders.isDispatched() +"\t"+ orders.isWorkedOn());
				
				System.out.println("\n");
			}
		}
		
	}
	

}
