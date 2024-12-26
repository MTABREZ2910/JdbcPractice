package com.jdbcPractice.JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest5 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		String url=
				 "jdbc:oracle:thin:@microcare_high?TNS_ADMIN=C://Users//kmdta//OneDrive//Documents//Desktop//Java_Full_Stack//Back-End//wallet_microcare_latest";
		String username="Admin";
		String password="Muzammil07##";
		String query=
				"select * from sales_2023 where extract(month from sales_date)=?";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement ps=con.prepareStatement(query);
		ps.setInt(1,11);
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getDate("sales_date")+" ");
			System.out.print(rs.getString("item")+" ");
			System.out.print(rs.getString("transaction_type")+" ");
			System.out.print(rs.getDouble("amount")+" ");
			System.out.println();
		}
		
		rs.close();
		con.close();
		
	

	}

}
