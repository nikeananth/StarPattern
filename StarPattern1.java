package starPattern;

import java.util.Scanner;

public class StarPattern1 {

	
	private static Scanner sc;
	public static void main(String[] args) 
	{
	
		System.out.println("Enter the no of rows* columns");
		sc=new Scanner(System.in);
		int side=sc.nextInt();
		
		for(int i=1;i<=side;i++) {
			
			for(int j=1;j<=side;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}
}