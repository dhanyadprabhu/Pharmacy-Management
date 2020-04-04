package com.cognizant.DBtest;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbTest {

	public static void main(String[] args) {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pharma_db","root","root");
			if(con!=null) {
				System.out.println("db connection success");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
