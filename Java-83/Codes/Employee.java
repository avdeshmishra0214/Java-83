class Employee 
{
	int empno;
	String ename;
	float sal;
	
	void setDetails(){
		ename = "Pankaj";
		sal = 5500.5f;
	}

	void getDetails(){
		System.out.println(empno + " | " + ename + " | " + sal);
	}

	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		System.out.println(emp.empno + " | " + emp.ename + " | " + emp.sal);

		emp.getDetails();

		//--- changing the state of object using reference
		emp.empno = 101;
		emp.ename = "Sunil";
		emp.sal = 2500.5f;

		emp.getDetails();

		//-- changing the state of object using method
		emp.setDetails();
		emp.getDetails();
	}
}
