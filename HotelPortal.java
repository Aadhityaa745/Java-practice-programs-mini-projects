package practice;

import java.util.Scanner;

public class HotelPortal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. Idly    2. Dosa   3. Chapathi");
		System.out.println("Enter An Option : ");
		int opt = sc.nextInt();
		
		if(opt == 1) {
			System.out.println("Your order placed for Idly");
		}
		else if(opt==2) {
			System.out.println("Your order placed for Dosa");
		}
		else if(opt==3) {
			System.out.println("Your order placed for Chapathi");
		}
		else {
			System.out.println("Invalid Option");
		}

	}

}
