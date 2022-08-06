package com.edureka.acc;

public class Account {
	
	int acno;
	String name;
	float bal;
	
	void deposit(float amt){};
	void withdraw(float amt) {};
	void getBalance() {};
	
	class SavaingsAccount extends Account {
		float roi;
		
		void calculateinterest() {};
		
	}
	
	class CurrentAccount extends Account {
		int transactionsCount;
		
		void serviceCharge() {};
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
