package com.assignments;
import java.util.Scanner;

public class sumAndAverage {

	public static void main(String[] args) {
		
        int i,n=0,s=0;
        double avg;
        {
        	System.out.println("Input Any 5 Numbers..");
        }
        for(i=0; i<5; i++) {
        	Scanner sc = new Scanner(System.in);
        	n=sc.nextInt();
        	s+=n;
     }
        avg=s/5;
        System.out.println("The Sum of 5 Number is :"+s+"\nThe Average of The Number is :"+avg);

	}

}
