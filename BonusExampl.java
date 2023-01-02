package practice;

import java.util.Scanner;

public class BonusExampl {

	public static void main(String[] args) {
		
		// bonus = salary*(5/100)
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("Enter Experience :");
		int vr = sc.nextInt();
		if(vr>5) {
			System.out.println("You will get bonus ");
			System.out.println("Enter Salary :");
			
			int sl = sc.nextInt();
			
			 double bonus = sl*5/100;
			
			 System.out.println("Your salary is :"+(sl+bonus));
		}
		else
			System.out.println("You will not get bonus ");
		*/
		
		System.out.println("Enter the Purchased Amount : ");
		int amt = sc.nextInt();
		
		if(amt>=1000) {
			System.out.println("You will get 10% Discount!");
			double discount = amt*10/100;
			System.out.println("Final Payment : "+(amt-discount));
		}
		else {
			System.out.println("Thanks for shopping with us");
		}

	}

}
