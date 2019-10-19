package String;

public class ReverseString {

	public static void main(String[] args) {
		String str ="All you need is Java";
		System.out.println(reverseString(str));

	}
	
	public static String reverseString(String str) { 
		
	String reverse= "";
	
	    for(int i = str.length()-1; i >=0; i--) {
	    	
	      reverse += str.charAt(i); }
	       return reverse;
	       
	       }

}
