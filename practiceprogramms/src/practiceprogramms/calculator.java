package practiceprogramms;

public class calculator {

	public static void main(String[] args) {
		
		int num1 = 30 , num2=20;
		
		String operation = "sub";

		switch (operation) {
		
		
		case "Add":
			System.out.println(num1+num2);
			break;
		case "Mul":
			System.out.println(num1*num2);
			break;
		case "sub":
			System.out.println(num1-num2);
			break;
		case "div":
			System.out.println(num1 / num2);
			break;
		default :
			System.out.println("Enter Valid Operation");
		
		}
		
	}

}
