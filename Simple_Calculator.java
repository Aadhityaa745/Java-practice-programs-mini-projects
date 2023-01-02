package practice;

import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {
		
		Simple_Calculator sv = new Simple_Calculator();
		
    Scanner sc = new Scanner(System.in);
    
    int arr [] = new int[5];
    int i;
    for(i =0; i<5;i++) {
    	System.out.println("Enter Number : ");
    	int number1 = sc.nextInt();
    	if(number1!=0) {
    		arr[i] = number1;// 5, 5, 4, 0
    	}
    	else {
    		break;
    	}
    }
    	if(i==2) {
    		add(arr[0], arr[1]);
    	}
    	else if(i==3) {
    		add(arr[0], arr[1], arr[2]);
    	}
    	else if(i==4) {
    		add(arr[0], arr[1], arr[2], arr[3]);
    	}
    	else if (i==5) {
    		sv.add(arr[0], arr[1], arr[2], arr[3], arr[4]);
    	}
    	else {
    		System.out.println("Invalid!!! You must enter atleast two numbers");
    	}
    
	}
static void add(int a, int b) {
	System.out.println(a+b);
}
static void add(int a, int b, int c) {
	System.out.println(a+b+c);
}
static void add(int a, int b, int c, int d) {
	System.out.println(a+b+c+d);
}
 void add(int a, int b, int c, int d, int e) {
	System.out.println(a+b+c+d+e);
}
}
