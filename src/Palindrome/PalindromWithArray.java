package Palindrome;

public class PalindromWithArray {

	public static void main(String[] args) {
		
		int [] arr = {1,2,3,5,2,1};
		//1.step
		int head =0; //1
		int tail =arr.length-1; //1
		//2.step
		int count =0;
		//3.step
		while(head<tail) {
			
			if(arr[head] != arr[tail]) {
				count++;
			}
			head++;
			tail--;
			
		}
		//4.step
		if(count>0) {
			System.out.println("NOT PALINDROME");
		}else
			System.out.println("PALINDROME");
		
		
		

	}

}
