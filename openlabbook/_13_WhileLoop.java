package assignment.openlabbook;

import java.util.Scanner;

public class _13_WhileLoop {
	public static void main(String[] args) {
		int number , sum=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please Enter a integer within 10 : ");
		
		number=scan.nextInt();
		
		while(number <= 10) {
			sum=sum+number;
			number++;
		}
		System.out.format("Sum of num is %d ",sum);
	}
}
