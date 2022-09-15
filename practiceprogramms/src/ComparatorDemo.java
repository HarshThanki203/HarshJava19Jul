package practiceprogramms;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<Employee>{
	
	public int compare(Employee e1, Employee e2) {
		int value=0;
		
		if(e1.getEsalary()>e2.getEsalary()) {
			
			value = -1;
		}
		else if(e1.getEsalary() >e2.getEsalary())
		{
			value= 1;
		}
		else if(e1.getEsalary()==e2.getEsalary()) {
			value = 0;
		}
		return value;
	}
	
	public static void main(String[] args) {
		ArrayList<Employee> List = new ArrayList<Employee>();
		
		Employee e1 = new Employee();
		e1.setEid(1);
		e1.setEname("Harsh");
		e1.setEsalary(10000000);
		
		Employee e2 = new Employee();
		e2.setEid(2);
		e2.setEname("Ajay");
		e2.setEsalary(100000);
		
		Employee e3 = new Employee();
		e3.setEid(3);
		e3.setEname("Atul");
		e3.setEsalary(10000);
		
		Employee e4 = new Employee();
		e4.setEid(4);
		e4.setEname("Tejas");
		e4.setEsalary(110000);
		
		Employee e5 = new Employee();
		e5.setEid(5);
		e5.setEname("Tirth");
		e5.setEsalary(20000);
		
		List.add(e1);
		List.add(e2);
		List.add(e3);
		List.add(e4);
		List.add(e5);
		
		Collections.sort(List, new ComparatorDemo());
		
		for(Employee e : List) {
			System.out.println("Eid :"+e.getEid()+"\nEname :"+e.getEname()+"\nEsalary :"+ e.getEsalary());
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}