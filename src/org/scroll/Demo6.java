package org.scroll;

import java.util.Iterator;
import java.util.Scanner;

public class Demo6 {
	
	public static void main(String[] args) {
	    int c=0;
		for(int n=0; n<=1000;n++) {
			

		int  a, i = 0, j = 0;
		
		a = n;
		while (a > 0) {
		i = a % 10;
		j = j + (i * i * i);
		a = a / 10;
		}
		if (n == j) {
			c++;
		System.out.println("Armstrong number"+j);
		}
		}
		System.out.println("Total Amstrong number   :  "+c);
	    }
		}
	


