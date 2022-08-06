import java.util.Scanner;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account acc = null;
		float amt;
		
		while (true) {
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Balance");
			System.out.println("5. Exit");
			
			System.out.println("----------------------------");
			System.out.print("Enter an option: ");
			int opt = sc.nextInt();
			
			switch(opt) {
			case 1:
				if(acc == null) {
					System.out.println("Enter A/C Number");
					long acno = sc.nextLong();
					sc.nextLine();
					
					System.out.print("Enter A/c holder's name: ");
					String name = sc.nextLine();
					
					System.out.print("Enter initial deposit: ");
					float amount = sc.nextFloat();
					
					acc = new Account (acno, name, amount);
					System.out.println("Account Opened: Thank you for Banking with us");
				}else {
					System.out.println("###--You have existing account ---###");
				}
				
				break;
			case 2:
				if(acc != null) {
					System.out.print("Enter amount to depsosit: ");
					amt = sc.nextFloat();
					acc.deposit(amt);
					
				}else {
					System.out.println("###-----You are not an existing customer---###");
				}
				break;
			case 3:
				if(acc != null) {
					System.out.print("Enter amount to withdraw: ");
					amt = sc.nextFloat();
					acc.withdraw(amt);
				}else {
					System.out.println("###---Account not found ---");
				}
				break;
			case 4:
				if(acc != null) {
					acc.getBalance();
				}else {
					System.out.println("~~You dont have an account with us~~");
				}
				break;
			case 5:
				System.out.println(" ###...It is good doing business with you");
				System.exit(0);
				break;
			default:
				System.out.println("--Not a valid option ### Try again");
			}
		
		}

	}

}
