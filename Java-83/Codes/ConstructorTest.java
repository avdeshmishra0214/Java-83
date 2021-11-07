class Employee 
{
	int empno;
	String ename;
	float sal;
	
	Employee(){
		System.out.println("******");
		empno = 101;
		ename = "Pankaj";
		sal = 5500.5f;
	}

	void getDetails(){
		System.out.println(empno + " | " + ename + " | " + sal);
	}
}

class ConstructorTest 
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();

		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}
}
