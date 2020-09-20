package com.unit6_user.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class GetConnection {
		
	public static Connection getConnect() {
		Connection conn = null;
		String address = "jdbc:mysql://localhost:3306/eomm?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
		String username = "root";
		String password = "123456";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(address, username, password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("connection failed");
		}
		return conn;
	}
	
	public static void main(String[] args) {
		getConnect();
	}

}
