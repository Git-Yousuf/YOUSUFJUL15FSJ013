package assignment.openlabbook;

import java.util.Scanner;

public class _01_Addition {
	public static void main(String[] args) {
		
		byte a,b;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		a=scan.nextByte();
		System.out.println("Enter Number 2 : ");
		b=scan.nextByte();
		
		byte c=(byte)(a+b);
		
		System.out.println("The Sum is "+c);
		
		
		
	}
}
