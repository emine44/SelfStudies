package Palindrome;

public class isPalindrome {

	public static void main(String[] args) {
		//ana == ana level =level  mom ==mom 
		
		String str = "level";
		
		String container =reverseString(str);
		
		if(str.equalsIgnoreCase(container)) {
			System.out.println("Palindrom");
		}else
			System.out.println(" NOT Palindrom");
		
		
		
		
/************SECONDWAY	
 *      int count =0;
		int head =0;
		int tail =str.length()-1;//5
		
		while(head<tail) {
			if(str.charAt(head) != str.charAt(tail)) {
				count++;
			}
			head++;
			tail--;
		}
		
		if(count>0) {
			System.out.println(false);
		}else
			System.out.println(true); */
		
		
		
		

	}
	
public static String reverseString(String str) {
		
		String container  ="";
		
		
		for(int i =str.length()-1 ; i>=0 ; i--) {
			
			container += str.charAt(i);
		}
		
		return container;
		
		
	}


}
