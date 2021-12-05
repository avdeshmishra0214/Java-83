package co.edureka.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
	@Id
	@GeneratedValue
	@Column(name = "EMP_NO", length = 5, unique = true, nullable = false)
	private Integer empNo;
	
	@Column(name = "EMP_NAME", length = 25)	
	private String empName;
	
	@Column(name = "EMP_SAL", length = 10, precision = 2)
	private Float empSal;
	public Integer getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public Float getEmpSal() {
		return empSal;
	}
	public void setEmpSal(Float empSal) {
		this.empSal = empSal;
	}
}
