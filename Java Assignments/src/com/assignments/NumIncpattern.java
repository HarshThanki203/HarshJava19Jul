package com.assignments;

import java.util.Scanner;

public class NumIncpattern {

	public static void main(String[] args) {
		
		int k=1;
	
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of Your Triangle :");
        int n= sc.nextInt();
        
      for( int i=1; i<=n; i++)
        	{
        	for(int j=1; j<=i; j++) {
        		System.out.print(i++);
        	}
        	System.out.println();
        	}
	}



	}


