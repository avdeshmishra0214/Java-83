package co.edureka.spring.core.beans;

public class User {
	private String firstName;
	private String lastName;

	public User() {
		System.out.println("in no argument constructor");
	}

	public User(String firstName, String lastName) {
		System.out.println("in two arguments constructor");		
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		System.out.println("in getFirstName()");		
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
		System.out.println("in setFirstName()");		
	}

	public String getLastName() {
		System.out.println("in getLastName()");		
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println("in setLastName()");		
	}

	@Override
	public String toString() {
		return "User [firstName= " + firstName + "| lastName= " + lastName + "]";
	}
}
