//Take Three Numbers From user And Print The Largest One......  

package com.assignments;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number...");
		int x = sc.nextInt();
		System.out.println("Enter Second Number...");
		int y = sc.nextInt();
		System.out.println("Enter Third NUmber...");
		int Z = sc.nextInt();
		
		if (x>y)
			if (x>Z) {
				System.out.println("Largest Number..."+x);
			}
		if (y>x)
			if (y>Z) {
			    System.out.println("Largest Value..."+y);
			}
		if (Z>x)
			if (Z>x){
			    System.out.println(" Your Largest Number is="+Z);
		}

	}

}
