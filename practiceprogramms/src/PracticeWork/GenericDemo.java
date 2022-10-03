package PracticeWork;
/*
 * Generic : It is heard in medical.
 * 			: It provides a Common Type to all the Datatype at Runtime.
 * 
 * Java provides you the common types only for Reference type and not for primitive type.
 * 
 * Reference types: Class
 * 
 * <E>
 * 
 * 
 * 
 */

public class GenericDemo {
	
	public static <E> void printArray(E[] inputArray)
	{
		for(E e : inputArray)
		{
			System.out.print(" "+ e);
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Integer intArray[]= {1,2,3,4,5};
		Double doubleArray[] = {1.1,2.2,3.3,4.4,5.5};
		Character characterArray[]= {'t','o','p','s'};
		printArray(intArray);
		printArray(doubleArray);
		printArray(characterArray);
	}

}
