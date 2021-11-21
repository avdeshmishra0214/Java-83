package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root", "root");
		
		Statement st = con.createStatement();
		
		//String sql = "INSERT INTO EMP VALUES(101, 'Sunil Joseph', 2500.75)";
		
		String sql = "INSERT INTO EMP VALUES(102, 'Anil', 3500.35),(103,'Rahul', 4250.75), "
				+ "(104,'Sachin',7500), (105,'Shankar Mahadev', 8250.50), (106,'Praveen', 4750)";
		
		try {
			int rowsInserted = st.executeUpdate(sql);
			System.out.println("###--- Employees Saved - "+rowsInserted+" ---###");
		}catch(Exception ex) {			
			System.out.println(ex);
		}
		
		//--- close the connection with DB
		st.close();
		con.close();
	}
}
