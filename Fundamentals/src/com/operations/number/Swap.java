package com.operations.number;

import java.util.Scanner;


/**
 * Swap Class has a method called reverse which simply reverses a number.
 * @author Liju Ram
 */

public class Swap {

	public void reverse() {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int input = obj.nextInt();
		int result =0;
		while (input!=0) {
			result = result*10 + input%10 ;
			input= input/10;
		}
		System.out.println("The swapped number is " +result);
	}
}
