package practice;

import java.util.Scanner;

public class VotingMachine {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int aadhi=0, abc = 0;
		for(int i=1;i<=10;i++) {
			System.out.println("Whom do you want to Vote \n1. Aadhitya \t2. ABC");
			int vote = sc.nextInt();
			if(vote == 1) aadhi++;
			else if(vote==2) abc++;
			else System.out.println("Invalid option");
		}
		if(aadhi>abc) System.out.println("Aadhi won by "+(aadhi-abc)+" votes");
		else System.out.println("ABC won"+(abc-aadhi)+" votes");
		
	}
}
