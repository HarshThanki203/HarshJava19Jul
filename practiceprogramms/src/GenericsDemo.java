package practiceprogramms;

public class GenericsDemo {
	
	public static <E> void printArray(E[] inputArray) {
		for(E e : inputArray) {
			System.out.print(" "+ e);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Integer intArray[] = {1,2,3,4,5};
		Double doubleArray[] = {1.2,3.4,5.6,7.8};
		Character characterArray[] = {'a','b','c','d','e'};
		printArray(intArray);
		printArray(doubleArray);
		printArray(characterArray);
		}
	}


