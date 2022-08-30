package com.assignments;
import java.util.Scanner;
public class year {

	public static void main(String[] args) {
		
		int Y;
		System.out.println("Enter Any Year...");
		Scanner sc = new Scanner(System.in);
		Y = sc.nextInt();
		
		if (Y%100==0 && Y%400==0 || Y%100!=0 && Y%4==0) {
	         
			System.out.print(" Leap Year...");
		}
		
		else 
		{
			System.out.println("Not A Leap Year !");
		}

	}

}
