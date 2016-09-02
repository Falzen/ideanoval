package com.ideanoval.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect {
	
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {

		String dbName = "ideanoval";
		String host = "jdbc:mysql://localhost:3306/" + dbName;		
		String user = "root";		
		String mdp = "";
		
		Class.forName("com.mysql.jdbc.Driver");		
		Connection connection = DriverManager.getConnection(host, user, mdp);		
		
		return connection;	
		
	}
	
	
	public static void closeConnection(Connection c) {
		
		try {
			c.close();
		}
		catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		
	}
}