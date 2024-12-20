package com.jdbcPractice.JDBC_Practice;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTest {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		String url=
				 "jdbc:oracle:thin:@microcaredb3_high?TNS_ADMIN=C://Users//kmdta//OneDrive//Documents//Desktop//Java_Full_Stack//Wallet_microcaredb3";
		String username="Admin";
		String password="Microcaredb3";
		String query="select * from datatable;";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		Connection con=DriverManager.getConnection(url, username, password);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			System.out.print(rs.getString("first_name"));
			System.out.print(rs.getString("last_name"));
			System.out.print(rs.getDate("dob"));
			System.out.print(rs.getString("full_name"));
			System.out.print(rs.getInt("age"));
			System.out.println();
			
		}
		st.close();
		con.close();
	}

}
