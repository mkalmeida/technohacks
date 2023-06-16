package com.proj.calculator;

import java.util.Scanner;

public class CalcConfig {
	
	public static void main(String[] args) {
		
	System.out.println("***********************");
	System.out.println("Starting Calculator....");
	System.out.println("***********************");
	System.out.println("Type a number and then:" + "\n" + "A - ADDITION"  + "\n" + "B - SUBTRACTION"  + "\n" + "C - MULTIPLICATION"  + "\n" + "D - DIVISION"  + "\n" + "F - OUT ");
	System.out.println("Exemple 1: 2a3 = 5");
	System.out.println("Exemple 2: 5m4 = 20");
	
	while (opt != 'f') {
	menu();
	opt= input.next().charAt(0);
	teste();
	}
	
	}
	
	static char opt;
	static Double result = 0.0;
	
	static Scanner input = new Scanner(System.in);
	static Double n, m;
	static boolean valid;
	
	static boolean menu() {

		 while (valid == false) {
			 if (result == 0) {
			 n = input.nextDouble();
			 result = n;
			 opt= input.next().charAt(0);
			 } else {
				opt= input.next().charAt(0);
			 }
		 switch (opt) {
		 case 'a':
		 case 'A':
			 m = input.nextDouble();
			 result = result + m;
			 System.out.printf("Sum result: %.2f\n",  result);	
			return true;
		 case 's': 
		 case 'S': 
			 m = input.nextDouble();
			 result = result - m;
			 System.out.printf("Subtraction result: %.2f\n",  result);
			 return true;
		 case 'm':
		 case 'M':
			 m = input.nextDouble();
			 result = result * m;
			 System.out.printf("Multiplication result: %.2f\n",  result);
			 return true;
		 case 'd':
		 case 'D':
			 m = input.nextDouble();
			 result = result / m;
			 System.out.printf("Division result: %.2f\n",  result);
			 return true;
		 case 'f':
		 case 'F':
			 System.out.println("Final result: " + result);
			 System.exit(0);
			 return false;
		default:
			System.out.println("Final result: " + result);
			System.exit(0);
			return false;
		 }
			 
		 }
		return false;			 

}
	
	static boolean teste() {
		switch (opt) {
		case 'a':
		case 'A':
			 m = input.nextDouble();
			 result = result + m;
			 System.out.printf("Sum result: %.2f\n",  result);	
			return true;
		 case 's': 
		 case 'S': 
			 m = input.nextDouble();
			 result = result - m;
			 System.out.printf("Subtraction result: %.2f\n",  result);
			 return true;
		 case 'm':
		 case 'M':
			 m = input.nextDouble();
			 result = result * m;
			 System.out.printf("Multiplication result: %.2f\n",  result);
			 return true;
		 case 'd':
		 case 'D':
			 m = input.nextDouble();
			 result = result / m;
			 System.out.printf("Division result: %.2f\n",  result);
			 return true;
		 case 'f':
		 case 'F':
			 System.out.println("Final result: " + result);
			 System.exit(0);
			 return false;
		default:
			System.out.println("Final result: " + result);
			System.exit(0);
			return false;
		 }
	}

}