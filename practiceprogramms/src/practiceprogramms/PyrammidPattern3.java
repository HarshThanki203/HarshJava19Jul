package practice;

public class PyrammidPattern3 {

	public static void main(String[] args) {
		for (int i = 0 ; i <10; i++) {
			for (int sp= 0 ; sp <10-i ; sp++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j<=i; j++ ) {
				System.out.print(" *");
			}
			System.out.println();
		}

}
	
}