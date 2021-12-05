package co.edureka.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import co.edureka.spring.jdbc.entity.Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	//@Autowired
	private JdbcTemplate template;
	
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}

	public Integer saveEmployee(Employee emp) {
		String sql = "insert into emp values("+emp.getEmpno()+",'"+emp.getEname()+"',"+emp.getSal()+")";
		Integer rowsSaved = template.update(sql);
		return rowsSaved;
	}

	public Integer updateEmployee(Employee emp) {
		String sql = "UPDATE emp SET ename='"+emp.getEname()+"', SAL="+emp.getSal()+" WHERE empno="+emp.getEmpno();
		Integer rowsUpdated = template.update(sql);
		return rowsUpdated;
	}

	public Integer deleteEmployee(Integer eno) {
		String sql = "DELETE FROM emp WHERE empno="+eno;
		Integer rowsDeleted = template.update(sql);
		return rowsDeleted;
	}

	public Employee findEmployeeByNo(final Integer eno) {
		String sql = "SELECT ename, sal from emp WHERE empno="+eno;
		
		Employee emp = template.queryForObject(sql, new RowMapper<Employee>() {

			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				String name=rs.getString(1);
				Float sal = rs.getFloat(2);				
				return new Employee(eno, name, sal);
			}			
		}); 
		
		return emp;
	}

	public List<Employee> findAll() {
		String sql = "SELECT * FROM emp";		
		return template.query(sql, new ResultSetExtractor<List<Employee>>() {
			List<Employee> emps = new ArrayList<Employee>();
			
			public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
			  while(rs.next()) {	
				int eno = rs.getInt(1);
				String name=rs.getString(2);
				Float sal = rs.getFloat(3);				
				
				Employee emp = new Employee(eno, name, sal);
				emps.add(emp);	
			  }
			  return emps;
			}			
		});
	}

}
