package project;

import java.util.Scanner;

public class Sumoftwonumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter a and b values:");
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a + b + 1;
		System.out.println("the sum is:" + c + "-1");
	}

}
