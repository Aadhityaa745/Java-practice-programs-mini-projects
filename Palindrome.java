package practice;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		// 121 ---> Palindrome
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		int temp = num;
		int pal=0,mod=0;
		while(num>0) {
			mod=num%10;
			pal=(pal*10)+mod;
			num/=10;//num=num/10	
		}
		if(pal==temp) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}
}
