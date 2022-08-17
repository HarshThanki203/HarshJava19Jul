package practice;

import java.util.Scanner;

public class NestedIfEl {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A");
		int a = sc.nextInt();
		System.out.println("Enter B");
		int b = sc.nextInt();
		System.out.println("Enter C");
		int c = sc.nextInt();
		System.out.println("A ="+a+", B = "+ b +", C = "+ c +".");
		
		if(a>b)
		{
			if(a>c) {
				System.out.println("A is Greater");
			}
			else {
				System.out.println("C is Greater ");
			}
			
		}
		
			else {
				
				if(b>c) {
					System.out.println("B is Greater");
				}
				else {
					System.out.println("C is Greater");
					}
			}
	
		}
}
	
