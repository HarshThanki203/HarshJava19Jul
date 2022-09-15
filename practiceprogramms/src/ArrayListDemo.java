package practiceprogramms;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

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
		
		System.out.println("---------Iterator-------");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("------List Iterator-----");
		ListIterator litr =al.listIterator();
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		
		System.out.println("Reverse print by ListIterator.");
		
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}

}


