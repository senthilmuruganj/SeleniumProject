package org.scroll;

import java.util.Scanner;

public class Demo4 {

	
	public static void main(String[] args) {
		Scanner rn = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = rn.nextInt();
		int a, i = 0, j = 0;
		a = n;
		while (a > 0) {
		i = a % 10;
		j = (j * 10) + i;
		a = a / 10;
		}
		System.out.println("Reverse number is=" + j);
		}
		}

