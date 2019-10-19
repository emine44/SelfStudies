package Reverse;

public class ReversWithString {

	public static void main(String[] args) {
		
		String name ="Feride";
		System.out.println(reverseString("Ruhan"));

	}
	
	public static String reverseString(String str) {
		
		String container  ="";
		
		
		for(int i =str.length()-1 ; i>=0 ; i--) {
			
			container += str.charAt(i);
		}
		
		return container;
		
		
	}

}
