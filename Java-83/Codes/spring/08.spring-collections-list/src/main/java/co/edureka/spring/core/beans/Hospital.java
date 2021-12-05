package co.edureka.spring.core.beans;

import java.util.List;

public class Hospital {
	private String hospitalName;
	private List<String> deparmentNames;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public List<String> getDeparmentNames() {
		return deparmentNames;
	}

	public void setDeparmentNames(List<String> deparmentNames) {
		this.deparmentNames = deparmentNames;
	}

}
