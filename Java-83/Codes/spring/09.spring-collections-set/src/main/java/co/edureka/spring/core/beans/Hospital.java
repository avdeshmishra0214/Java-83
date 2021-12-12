package co.edureka.spring.core.beans;

import java.util.List;
import java.util.Set;

public class Hospital {
	private String hospitalName;
	private Set<String> deparmentNames;

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public Set<String> getDeparmentNames() {
		return deparmentNames;
	}

	public void setDeparmentNames(Set<String> deparmentNames) {
		this.deparmentNames = deparmentNames;
	}

}
