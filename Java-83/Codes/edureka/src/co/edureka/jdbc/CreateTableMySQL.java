package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableMySQL {

	public static void main(String[] args) throws Exception{
		//--- initialize JDBC driver for MySQL
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//--- connect to MySQL Database edureka
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka", "root", "root");
		
		//--- create an object for passing SQL queries to connected DB
		Statement st = con.createStatement();
		
		String sql = "CREATE TABLE EMP (EMPNO INT(5), ENAME VARCHAR(30), SAL FLOAT(10,2), PRIMARY KEY(EMPNO))";
		
		try {
			st.execute(sql);
			System.out.println("###--- Database Table Created ---###");
		}catch(Exception ex) {
			System.out.println("###--- Database Table Could not be Created as of ---###");
			System.out.println(ex);
		}
		
		//--- close the connection with DB
		st.close();
		con.close();

	}

}
