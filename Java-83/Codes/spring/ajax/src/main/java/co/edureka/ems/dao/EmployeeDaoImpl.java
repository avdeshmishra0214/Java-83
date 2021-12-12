package co.edureka.ems.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import co.edureka.ems.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jt;
	
	public Employee findEmployeeByEmpNo(final Integer eno) {
		Employee emp = jt.query("select ename,sal from emp where empno="+eno,new ResultSetExtractor<Employee>() {

			public Employee extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next()) {
					String name = rs.getString(1);
					float sal = rs.getFloat(2);
					return new Employee(eno, name, sal);
				}
				return null;
			}			
		});
		return emp;
	}

}
