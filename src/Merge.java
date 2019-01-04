package customerMVC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import customerMVC.DBConnection;
import customer.CustomerView;

public class Merge {
	
	customer.CustomerView cv;
	
	public Merge(customer.CustomerView cv) {
		this.cv=cv;
	}
	

}
