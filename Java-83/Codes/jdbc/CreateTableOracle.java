package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableOracle {

	public static void main(String[] args) throws Exception {
		//--- initialize JDBC driver for Oracle
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//--- connect to Oracle Database XE
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "java83", "password");
		
		//--- create an object for passing SQL queries to connected DB
		Statement st = con.createStatement();
		
		String sql = "CREATE TABLE EMP (EMPNO NUMBER(5), ENAME VARCHAR(30), SAL NUMBER(10,2), PRIMARY KEY(EMPNO))";
		
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
