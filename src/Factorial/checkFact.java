package Factorial;

import java.util.Scanner;

public class checkFact {

	public static void main(String[] args) {
		// 5!   1*2*3*4*5 ! =120
		//4! =4*3*2*1 =24
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num = scan.nextInt();
		double factorialSum =1;
		
		for(int i =1 ; i<=num; i++ ) {
			
			factorialSum = factorialSum*i;
			
		}
		
		System.out.println("Factorial of your number is " + factorialSum);
		
		

	}

}
