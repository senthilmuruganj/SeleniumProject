package org.scroll;

import java.util.Scanner;

public class Demo3 {

		public static void main(String[] args) {
		int a, b;
		Scanner sw = new Scanner(System.in);
		System.out.println("The numbers are");
		a = sw.nextInt();
		b = sw.nextInt();
		a = a+b;
		b =a- b;
		a =a-b ;
		System.out.println("swapping numbers are");
		System.out.println(a);
		System.out.println(b);
		}
		}

