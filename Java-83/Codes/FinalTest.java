//final class A {
class A{
	final void display(){}
}

class B extends A{
	void display(){}
}

class FinalTest 
{
	/*
	//-- a constructor cannot be final - error: modifier final not allowed here
	final FinalTest(){}
	*/
	final int n = 12; //instance variable

	public static void main(String[] args) 
	{
		final int n = 25; //local variable
		System.out.println(n);

		//n = 26; //error: cannot assign a value to final variable n
		System.out.println(n);

		FinalTest obj = new FinalTest();
		System.out.println(obj.n);
		//obj.n = 13; //error: cannot assign a value to final variable n
	}
}
