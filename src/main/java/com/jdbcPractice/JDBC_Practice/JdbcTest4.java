package com.jdbcPractice.JDBC_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcTest4 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException {
		// TODO Auto-generated method stub
		String url=
				 "jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=C://Users//kmdta//OneDrive//Documents//Desktop//Java_Full_Stack//Wallet_microcaredb3";
		String username="Admin";
		String password="";
		String query =
				"delete from student where section=?";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection(url,username,password);
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1,"A");
		ResultSet rs=ps.executeQuery();
		System.out.println("Row Deleted");
		
		rs.close();
		con.close();
		

	}

}
