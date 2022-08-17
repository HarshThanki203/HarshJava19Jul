package practice;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		for (int i = 0 ; i <10 ; i++)
		{
			for(int sp = 0 ; sp <=10 ; sp++) {
				System.out.println(sp);
			}
			
			for(int j = 0 ; j <=i ; j++ )
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
	}

}
