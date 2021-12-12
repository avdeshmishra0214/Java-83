class Employee 
{
	int empno;
	String ename;
	float sal;
	
	Employee(){	}

	Employee(int empno, String ename){
		this.empno = empno;
		this.ename = ename;
	}

	Employee(int a, String b, float c){
		this(a,b); //constructor chaining
		/*
		empno = a;
		ename = b;
		*/
		sal = c;
	}

	void getDetails(){
		System.out.println(this.empno + " | " + this.ename + " | " + this.sal);
	}
}

class OverloadingConstructors 
{
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee();
		Employee emp2 = new Employee(101, "Sunil");
		Employee emp3 = new Employee(102, "Praveen", 2500f);

		emp1.getDetails();
		emp2.getDetails();
		emp3.getDetails();
	}
}