package assignment.openlabbook;

import java.util.Scanner;

public class _17_AreaOfRectangle {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter length of Rectangle : ");
		
		double length=scan.nextDouble();
		
		System.out.println("Enter Width of Rectangle : ");
		
		double width = scan.nextDouble();
		
		double area=length*width;
		
		System.out.println("Area of the rectangle is "+area);
	}
}
