package String;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static boolean isPalindrome(String s) { 
		int head = 0;
	    int tail = s.length() - 1;
	    
	while (head < tail) {
		
	if (s.charAt(head) != s.charAt(tail)) { 
		
		return false;
	           
	}
	           head++;
	           tail--;
	}
	return true;

}
}
