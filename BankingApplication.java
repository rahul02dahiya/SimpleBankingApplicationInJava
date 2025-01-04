package bankAccount;

import java.util.Scanner;

class User {
	private int accountNum;
	private String userName;
	private double balance;

	public int getAccountNum() {
		return accountNum;
	}

	public void setAccountNum(int accountNum) {
		this.accountNum = accountNum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public double getBalance() {
		return balance;
	}

	public void addBalance(double balance) {
		this.balance += balance;
		System.out.println("Amount added successfully...");
	}

	public void withdrawBalance(double balance) {
		this.balance -= balance;
		System.out.println("Withdrawal successfull...");
	}
}

public class BankingApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User accUser = new User();
		Scanner in = new Scanner(System.in);

		System.out.println("Welcome to Bank of Gold Diggers ...");

		System.out.println("Please enter your name :");
		accUser.setUserName(in.next());

		System.out.println("Please enter your accountNumber :");
		accUser.setAccountNum(in.nextInt());

		while (true) {

			System.out.println("\n ....................................................");
			System.out.println("Enter 1 to add funds");
			System.out.println("Enter 2 to withdraw funds.");
			System.out.println("Enter 3 to check current balance");
			System.out.println("Enter 0 to exit");

			int key = in.nextInt();

			if (key == 0) break;

			switch (key) {
			case 1: {
				System.out.println("\n ....................................................");
				System.out.println("Enter the funds to add");
				accUser.addBalance(in.nextInt());
				break;
			}
			case 2: {
				System.out.println("\n ....................................................");
				System.out.println("Enter the funds to withdraw");
				accUser.withdrawBalance(in.nextInt());
				break;
			}
			case 3: {
				System.out.println("\n ....................................................");
				System.out.println("Hii " + accUser.getUserName() + ", your account details is below:");
				System.out.println("Account number : " + accUser.getAccountNum());
				System.out.println("Available balance : " + accUser.getBalance());
				break;
			}
			default:
				System.out.println("\nTransaction terminated, Invalid option !!!");

			}
		}
		
		System.out.println("\nThank you for coming to Bank of Gold Diggers! See you " + accUser.getUserName());
		in.close();
	}

}
