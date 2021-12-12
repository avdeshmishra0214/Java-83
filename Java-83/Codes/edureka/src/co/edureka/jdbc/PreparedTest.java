package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		Connection con = ConnectionFactory.getDbConnection();
		
		PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");
		
		con.setAutoCommit(false); // <-----
		
		String req = "Y";
		
		while(req.equalsIgnoreCase("Y")) {
			System.out.println("enter empno, name, salary:");
			int empno = sc.nextInt();
			String name = sc.next();
			float sal = sc.nextFloat();
			
			pst.setInt(1, empno);
			pst.setString(2, name);
			pst.setFloat(3, sal);
			
			int n = pst.executeUpdate();
			System.out.println("--- employee saved ---\n");
			
			System.out.print("do you want to save more employees[Y/N]: ");
			req = sc.next();
		}
		
		System.out.print("do you want to commit the changes in DB [Y/N]: ");
		req = sc.next();
		if(req.equalsIgnoreCase("Y"))
			con.commit();
		else
			con.rollback();
		
		pst.close();
		con.close();
	}
}
