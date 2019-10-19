package PrimeNumber;

public class CheckIsPrime {

	public static void main(String[] args) {
		// even =cift sayi odd =tek sayi prime = kendisine ve bir disinda boleni olmayan

		System.out.println(isPrime(96));
		
		
		}
		
	
	public static boolean isPrime(int num) {
		
		
		for(int i = 2; i<num ; i++) { //Math.sqrt(num) da olabilir
		if(num %i == 0) {
			return false;
		   }
	     }
		return true;

	}

}
