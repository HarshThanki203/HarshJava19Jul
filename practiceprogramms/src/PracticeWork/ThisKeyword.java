package PracticeWork;

class Student{
	
	int rollno;
	String sname;
	
	Student()
	{
		System.out.println("Default Constructor Called");
	}
	
	Student(int rollno,String sname)
	{
		this();
		this.rollno = rollno;
		this.sname = sname;
		System.out.println("RollNo."+this.rollno);
		System.out.println("Name :"+this.sname);
	}
}

public class ThisKeyword {
      
	public static void main(String[] args)
	{
		Student s = new Student(18,"Harsh");
	}
}
