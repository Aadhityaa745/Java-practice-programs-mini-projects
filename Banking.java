package practice;

import java.util.Scanner;

public class Banking {
	static Scanner sc = new Scanner(System.in);
	static int balance = 2543;
	static String acchldname = "Aadhityaa";
	static int pno = 4532;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to hdfc bank");
		System.out.println("Enter pin no.");
		int pnno = sc.nextInt();
		
		if(pno==pnno) {
			
			System.out.println("Welcome "+acchldname);
			System.out.println("Choose an option from the below");
			System.out.println("1. Withdraw  2. Deposit");
			int opt = sc.nextInt();
			if (opt==1){
				withdraw();
			}
			else if (opt==2) {
				deposit();
			}
		}
		else {
			System.out.println("Incorrect pin no.");
		}
	}
	
public static void withdraw(){
	System.out.println("Enter the amount to be withdrawn");
	int amt = sc.nextInt();
	int newbal = balance - amt;
	System.out.println("Your transaction is being processed:");
	System.out.println("Balance is "+newbal);
}
public static void deposit() {
	System.out.println("Enter the amount that you want to deposit");
	int amt = sc.nextInt();
	int newbal = balance + amt;
	System.out.println("Your transaction is being processed:");
	System.out.println("Your Current balance is:"+newbal);
}
}
