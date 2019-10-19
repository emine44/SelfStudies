package Palindrome;

public class isSentencePalindrom {

	public static void main(String[] args) {
		
		String str = "mom is mom";
		//ey edip adanada pide ye
		
		//1.step
		
		 String []arr = str.split(" ");
		// char [] arr = str.toCharArray();
		 
		//2.step
		 
		 int head =0 , tail =arr.length-1 , count =0;
		 
	   //3.step
		 while(head<tail) {
			 
			 if(!(arr[head].equalsIgnoreCase(reverseString(arr[tail]))))
			 {
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
	
public static String reverseString(String str) {
		
		String container  ="";
		
		
		for(int i =str.length()-1 ; i>=0 ; i--) {
			
			container += str.charAt(i);
		}
		
		return container;
		
		
	}

}
