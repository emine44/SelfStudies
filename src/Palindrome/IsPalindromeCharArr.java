package Palindrome;

public class IsPalindromeCharArr {

	public static void main(String[] args) {
		
		String str ="ey edip pide     ye";
		
		char [] arr = str.replace(" ","").toCharArray();
		
		int head=0 , tail =arr.length-1 , count=0;
		
		while(head<tail) {
			if(arr[head] !=arr[tail]) {
				count++;
			}
			head++;
			tail--;
			
		}
		
		if(count>0) {
			 System.out.println("NOT PALINDROME");
		 }else
			 System.out.println(" PALINDROME");
		

	}

}
