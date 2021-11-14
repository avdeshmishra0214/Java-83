class Except6 
{
	public static void main(String[] args) 
	{
		try{
			int x = Integer.parseInt(args[0]);
			int y = Integer.parseInt(args[1]);
			int z = x / y;
			System.out.println(x + " / " + y + " = " + z);
		}
		catch(Exception ex){
			System.out.println("-- inside catch block --");
			System.out.println("getMessage() ---> " + ex.getMessage());
			System.out.println("toString() ---> " + ex.toString());
			System.out.println("------------------------------------------");
			ex.printStackTrace(); //---> toString() + callstack
			System.out.println("------------------------------------------");
			System.out.println("Exception Type ---> " + ex.getClass().getName());
			System.out.println("------------------------------------------");

			if(ex instanceof ArithmeticException){
				System.out.println("---- CANNOT DIVIDE A NUMBER BY ZERO ----");
			}
		}

		System.out.println("---- DONE ----");
	}
}