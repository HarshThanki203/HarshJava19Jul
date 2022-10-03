package PracticeWork;

public class Box {
	
	double width,height,depth;

	Box()
	{
		width = 50;
		height = 5;
		depth =4;
		System.out.println("Default Constructor Called");
	}
	
	Box(double w, double h, double d)
	{
		System.out.println("Parameterized Constructor called :");
		width = w;
		height = h;
		depth = d;
		
	}
	Box(Box obj)
	{
		System.out.println("Copy Constructor Called :");
		width = obj.width;
		height = obj.height;
		depth =obj.depth;
	}
	
	void volume()
	{
		System.out.println("Volume Of Box is "+(width*height*depth));
	}
	public static void main(String[] args) {
		
		 Box b1 = new Box();
		 b1.volume();
		 Box b2 = new Box();
		 b2.volume();
		 Box b3 = new Box();
		 b3.volume();
	}

}
