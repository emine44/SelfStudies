package String;

public class ReverseStringCharArray {

	public static void main(String[] args) {
		
		String str = new String("Good morning");
		
		char [] s = str.toCharArray();
		
		printReverse(s);

	}

	public static void printReverse(char[] letters){
		
		for (int i = letters.length-1; i >= 0 ; i--){
			
		System.out.print(letters[i]);
		} 
		
	}
		 
}
