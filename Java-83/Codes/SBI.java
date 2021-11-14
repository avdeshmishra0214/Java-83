class SBI implements Bank 
{
  public void deposit(float amt){
	  System.out.println("Rs."+amt+" got credited in SBI Account");
  }
  
  public void withdraw(float amt){
	  System.out.println("Rs."+amt+" go debited from SBI Account");
  }
}
