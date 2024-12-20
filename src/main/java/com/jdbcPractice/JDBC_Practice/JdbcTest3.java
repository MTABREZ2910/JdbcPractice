package com.jdbcPractice.JDBC_Practice;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

public class JdbcTest3 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		String url=
				 "jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=C://Users//kmdta//OneDrive//Documents//Desktop//Java_Full_Stack//Wallet_microcaredb3";
		String username="Admin";
		String password="Microcaredb3";
		String query=
				"insert into student values (?,?,?,?)";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1, 2);
		ps.setString(2,"tabrez");
		Calendar cal=Calendar.getInstance();
		cal.set(cal.YEAR, 2002);
		cal.set(cal.MONTH, 10);
		cal.set(cal.DATE, 29);
		
		ps.setDate(3,new Date(cal.getTimeInMillis()));
		ps.setString(4,"A");
		for(int i=0;i<10;i++) {
		ResultSet rs=ps.executeQuery();
		System.out.println("Row Inserted");

		}
		
		
		con.close();
		ps.close();
		
	}

}
