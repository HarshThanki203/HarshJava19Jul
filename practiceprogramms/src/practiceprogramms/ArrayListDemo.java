package practiceprogramms;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(12.35);
		al.add('t');
		al.add("tops");
		al.add(null);
		al.add(true);
		al.add(10);
		System.out.println(al);
		
		System.out.println(al.size());
		System.out.println(al.indexOf(12.35));
		System.out.println(al.isEmpty());
		System.out.println(al.remove(3));
		System.out.println(al.set(3, 100));
		System.out.println(al); 
		
	}

}
