package SumOfDigits;

import java.util.Scanner;

public class FindSumOfDigits {

	public static void main(String[] args) {

		 int num = 123; //1+3+5+6
		 int sum =0;
		
		while (num>0) {
			sum = sum + num%10; // 
			num = num/10; // num=12 num=1
		}
		
		System.out.println(sum);

	}

}
