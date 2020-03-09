package starPattern;

import java.util.Scanner;

public class StarPattern2Triangle {

	

	static Scanner sc;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		sc=new Scanner(System.in);
		System.out.println("enter the data side");
		int side=sc.nextInt();
		
		for(int i=1;i<=side;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		

	}

}
