package co.edureka.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class ProcedureCall {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDbConnection();
		
		CallableStatement cst = con.prepareCall("{call update_employee_salary(?, ?, ?)}");
		
		int empno = 104;
		int hike = 10;
		
		cst.setInt(1, empno);
		cst.setInt(2, hike);
		cst.registerOutParameter(3, Types.FLOAT);
		
		cst.execute();
		
		System.out.println("Updated Salary of Employee -> "+ empno+" is Rs."+ cst.getFloat(3));
		
		cst.close();
		con.close();
	}
}
