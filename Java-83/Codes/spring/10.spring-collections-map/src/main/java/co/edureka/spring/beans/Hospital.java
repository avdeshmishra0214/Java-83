package co.edureka.spring.beans;

import java.util.Map;

public class Hospital {
	private String hospitalName;
	private Map<String, String> deptWithHod;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Map<String, String> getDeptWithHod() {
		return deptWithHod;
	}

	public void setDeptWithHod(Map<String, String> deptWithHod) {
		this.deptWithHod = deptWithHod;
	}
}
