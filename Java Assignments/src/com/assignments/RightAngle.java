package com.assignments;
import java.util.Scanner;

public class RightAngle {

	public static void main(String[] args) {
		
		int row;
		System.out.println("Enter Size of Your Triangle :");
        Scanner sc = new Scanner(System.in);
        row  = sc.nextInt();
        
        for(int i=1; i<=row; i++)
        	{
        	for(int j=1; j<=i; j++) {
        		System.out.print(j);
        	}
        	System.out.println();
        	}
	}

}
