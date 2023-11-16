package shapeProcess;

import shapePack.*;
import java.util.Scanner;

public class ShapeExecute
{
	public static void main(String args[])
	{		
		System.out.println("Shapes - by Doreen Chirwa");
		System.out.println("_____________________________\n");
		Scanner myScn = new Scanner(System.in);
		
		double sideOne, areaResultOne;
		double length, breadth, areaResultTwo;
		
		Square sqre = new Square();		
		sqre.printShape();
		sqre.printRectangle();
		sqre.printSquare();
		
		//Area of Square
		System.out.print("\nArea of Square\n");
		System.out.print("Please enter the measure of a side: ");
		sideOne = myScn.nextDouble();
		areaResultOne = sqre.calculateArea(sideOne);
		System.out.print("RESULT: Area of Square = " + areaResultOne);
		
		//Area of Rectangle
		System.out.print("\n\nArea of Rectangle\n");
		System.out.print("Please enter the measure of length: ");
		length = myScn.nextDouble();
		System.out.print("Please enter the measure of breadth: ");
		breadth = myScn.nextDouble();
		areaResultTwo = sqre.calculateArea(length, breadth);
		System.out.print("RESULT: Area of Rectangle = " + areaResultTwo);
		
		System.out.println("\n\n-----------------------------");
		
		SemiCircle circ = new SemiCircle();
		circ.printShape();
		circ.printSemiCircle();
		circ.printCircle();
		
		myScn.close();
	}	

}
