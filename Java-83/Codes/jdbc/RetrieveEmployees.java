package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployees {

	public static void main(String[] args) throws Exception{
		/*
		Class.forName("com.mysql.cj.jdbc.Driver");		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root", "root");
		*/
		
		Connection con = ConnectionFactory.getDbConnection();
		
		Statement st = con.createStatement();
		
		String sql = "SELECT * FROM EMP";		
		
		ResultSet records = st.executeQuery(sql);
			
		while(records.next()) {
			int empno = records.getInt(1);
			String name = records.getString(2);
			//float sal = records.getFloat(3);
			float sal = records.getFloat("sal");
				
			//System.out.println(empno + " | " + name + " | " + sal);
			
			String formattedEmployee = String.format("%-5d | %-16s | %.2f", empno, name, sal);
			System.out.println(formattedEmployee);
			
			Thread.sleep(2000);
		}
		
		//--- close the connection with DB
		records.close();
		st.close();
		con.close();		

	}

}
