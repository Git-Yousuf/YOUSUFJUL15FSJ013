package assignment.openlabbook;

import java.util.Scanner;

public class _03_MultiplyTwo {
	public static void main(String[] args) {
		int num1,num2,multiply;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number 1 :");
		num1=scan.nextInt();
		System.out.println("Enter Number 2 :");
		num2=scan.nextInt();
		
		multiply=num1*num2;
		
		System.out.printf("The Multiplication of "+num1+" and "+num2+" is "+multiply);
	}
}
