import java.util.Scanner;

class ATM 
{
	public static void main(String[] args) 
	{
		Bank bank = null;

		Scanner sc = new Scanner(System.in);

		System.out.print("enter card type [1.SBI | 2.ICICI]: ");
		int cardType = sc.nextInt();
		System.out.println("--------------------------------------------");

		switch(cardType){
			case 1:
				bank = new SBI();
				break;
			case 2:
				bank = new ICICI();
				break;
			default:
				System.out.println("--- INVALID CARD TYPE ---");
				return; //System.exit(0);
		} //switch

		System.out.println("Welcome to "+ bank.getClass().getName());

		System.out.print("enter amount to deposit: ");
		float amt = sc.nextFloat();
		bank.deposit(amt);

		bank.withdraw(750.50f);
	}
}
