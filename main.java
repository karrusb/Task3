package WOTS;

import java.util.Scanner;

import com.mysql.jdbc.Connection;

public class main {
	
	public static void main(String[] args)
	{
		Connection connection = null;
		
		CreateOrder or = new CreateOrder();
		or.orderMenu();
		DBConnector dbc = new DBConnector();
		
		connection = dbc.createConnection();	
	}

}
