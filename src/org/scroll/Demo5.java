package org.scroll;

import java.util.Scanner;

public class Demo5 {
  public static void main(String[] args) {
	
	  int count=0;
	  for(int n=0; n<=1000; n++) {
	  int  a, i = 0, j = 0;
	 
	  a=n;
	
	while (a > 0) {
	i = a % 10;
	j = (j * 10) + i;
	a = a / 10;
	}
	if (n == j) {
		count=count+1;
	System.out.println("palindrome   :" +j);
	} 
		}
	System.out.println("Total no of Palindrom   : "+count);
  }
}

	

