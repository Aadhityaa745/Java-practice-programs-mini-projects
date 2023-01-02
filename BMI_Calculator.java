package practice;

import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Weight");
		int weight = sc.nextInt();
		System.out.println("Enter the Height");
		double height = sc.nextDouble();
		height/=100;
		double bmi = weight/(height*height);
		System.out.println("The BMI is :"+bmi);
	if (bmi<18) {
		System.out.println("Underweight:");
		}
	else if (bmi>=18&&bmi<=25) {
		System.out.println("Normal");}
	
		else if (bmi>=26&&bmi<=30) {
			System.out.println("Overweight");}
		else 
			System.out.println("Obesity");
			
	}
		

	}
	


