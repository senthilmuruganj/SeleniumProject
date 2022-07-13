package org.scroll;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int number = 47;
		boolean val =false;
		for(int i = 2; i <= number / 2; i++) {
			if(number % i == 0) {
				val =true;
				break;
			}
		}
		if(!val)
			System.out.println(number+ "is a prime number  ");
		else
			System.out.println(number+ "is not a Prime number");
	}

}
