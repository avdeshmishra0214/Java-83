package co.edureka.hibernate.entity;

public class Student {
	private Integer studId;
	private String studName;
	private String email;
	private String mobile;

	public Student() {	}

	public Student(String studName, String email, String mobile) {
		this.studName = studName;
		this.email = email;
		this.mobile = mobile;
	}

	public Student(Integer studId, String studName, String email, String mobile) {		
		this.studId = studId;
		this.studName = studName;
		this.email = email;
		this.mobile = mobile;
	}

	public Integer getStudId() {
		return studId;
	}

	public void setStudId(Integer studId) {
		this.studId = studId;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		String student = String.format("Student[%-3d | %-14s | %-20s | %10s]", studId, studName, email, mobile);
		return student;
	}
}
