class ICICI implements Bank 
{
  @Override
  public void deposit(float amt){
	  System.out.println("Rs."+amt+" got credited in ICICI Account");
  }
  
  public void withdraw(float amt){
	  System.out.println("Rs."+amt+" go debited from ICICI Account");
  }
}