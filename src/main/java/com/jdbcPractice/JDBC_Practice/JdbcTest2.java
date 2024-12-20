package com.jdbcPractice.JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest2 {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		String url=
				 "jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=C://Users//kmdta//OneDrive//Documents//Desktop//Java_Full_Stack//Wallet_microcaredb3";
		String username="Admin";
		String password="";
		String query="select * from student where section=?";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection(url, username, password);
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,"A");
		ResultSet rs=ps.executeQuery();
		while(rs.next()) {
			System.out.print(rs.getInt("id"));
			System.out.print(rs.getString("name"));
			System.out.print(rs.getDate("dob"));
			System.out.print(rs.getString("section"));
			System.out.println();
		}
		
		ps.close();
		con.close();

	}

}
