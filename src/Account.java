
public class Account {
	long acno;
	String name;
	float bal;
	public Account(long acno, String name, float bal) {
		this.acno = acno;
		this.name = name;
		this.bal = bal;
	}
	void deposit(float amt) {
		this.bal = this.bal + amt;
		System.out.println("£ " + amt + " Credited | Balance:  " + this.bal);
	}
	void withdraw(float amt) {
		if(this.bal >= amt) {
			this.bal -= amt;
			System.out.println("£. " + amt+ "Debited | Balance" + this.bal);
		}else {
			System.out.println("***--Insuficient balance--***");
		}
	}
	void getBalance() {
		System.out.println("Acoount No: " +this.acno + " | Name" + this.name + " | Balance: "+this.bal);
	}
}
