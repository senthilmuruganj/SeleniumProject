package org.scroll;

import java.util.Scanner;

public class TestDemo {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int d = sc.nextInt();
		if(d % 2 ==1) {
			System.out.println("Entered no is odd number  " +d);
		}else
		{
			System.out.println("Entered no is even number  " +d);
		}
		
	}

}
