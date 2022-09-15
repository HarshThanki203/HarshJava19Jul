package practiceprogramms;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


	class Employee implements Serializable{
		
		int Eid;
		String Ename;
		double ESalary;
		
		public Employee(int eid, String ename, double eSalary) {
			
			Eid = eid;
			Ename = ename;
			ESalary = eSalary;
		}
		
		public String toString()
		{
			return "\nEmployeeNo : "+Eid+"\nEname : "+Ename+"\nESalary : "+ESalary;
		}
			
	}


	public class Serializations {
		
		public static void main(String[] args) throws Exception {
			
			Employee e = new Employee(1, "Harsh", 30000);
			Employee e2 = new Employee(2,"Ajay"
					+ " ",32000);
			FileOutputStream fos = new FileOutputStream("ser.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(e); 
			oos.writeObject(e2);
			oos.flush();
			oos.close();
			
			
			FileInputStream fis = new FileInputStream("ser.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Employee e1 = (Employee)ois.readObject();
			Employee e3 = (Employee)ois.readObject();
			System.out.println(e1);
			System.out.println(e3);
		}

	}

