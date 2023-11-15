package shapeProcess;

import shapePack.*;

public class ShapeExecute
{
	public static void main(String args[])
	{
		System.out.println("Shapes - by Doreen Chirwa\n");
		
		Square sqre = new Square();
		SemiCircle circ = new SemiCircle();
		
		sqre.printShape();
		sqre.printRectangle();
		sqre.printSquare();
		
		System.out.println("------------");
		
		circ.printShape();
		circ.printSemiCircle();
		circ.printCircle();
	}	

}
