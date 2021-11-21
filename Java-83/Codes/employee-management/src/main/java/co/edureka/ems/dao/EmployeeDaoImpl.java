package co.edureka.ems.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import co.edureka.ems.configs.ConnectionFactory;
import co.edureka.ems.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	private static Statement st;
	
	public EmployeeDaoImpl() throws Exception{
		Connection con = ConnectionFactory.getDbConnection();
		st = con.createStatement();
	}
	
	public Integer saveEmployee(Employee emp) throws Exception {
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")";
		Integer rowsSaved = st.executeUpdate(sql);
		return rowsSaved;
	}

	public Integer updateEmployee(Employee emp) throws Exception {
		String sql = "UPDATE emp SET ename='"+emp.getEname()+"', SAL="+emp.getSal()+" WHERE empno="+emp.getEmpno();
		Integer rowsUpdated = st.executeUpdate(sql);
		return rowsUpdated;
	}

	public Integer deleteEmployee(Integer eno) throws Exception {
		String sql = "DELETE FROM emp WHERE empno="+eno;
		Integer rowsDeleted = st.executeUpdate(sql);
		return rowsDeleted;
	}

	public Employee findEmployeeByNo(Integer eno) throws Exception {
		String sql = "SELECT ename, sal from emp WHERE empno="+eno;
		ResultSet rs = st.executeQuery(sql);
		
		Employee emp = null;
		
		if(rs.next()) {
			String name = rs.getString(1);
			float sal = rs.getFloat(2);
			emp = new Employee(eno, name, sal);
		}
		return emp;
	}

	public List<Employee> findAll() throws Exception {
		List<Employee> emps = new ArrayList<Employee>();

		String sql = "SELECT * FROM emp";
		ResultSet rs = st.executeQuery(sql);
		
		while(rs.next()) {
			int eno = rs.getInt(1);
			String name = rs.getString(2);
			float sal = rs.getFloat(3);
			
			Employee emp = new Employee(eno, name, sal);
			emps.add(emp);
		}
		return emps;
	}
}
