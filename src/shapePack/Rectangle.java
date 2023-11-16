package shapePack;

public class Rectangle extends Shape 
{	
	
	public void printRectangle()
	{
		System.out.println("This is Rectangle: Subclass of Shape");
	}
	
	//Calculating Area of Rectangle
	public double calculateArea(double length, double breadth)
	{
		 return length * breadth;
	}
}
