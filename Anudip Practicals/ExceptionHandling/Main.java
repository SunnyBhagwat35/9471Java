package axceptionHandling;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		System.out.println("enter to no.: ");
		n1= sc.nextInt();
		n2= sc.nextInt();
		
		try {
			float res  = n1/n2;
			System.out.println("Division: "+res);
			
		}
		catch(Exception e){
			System.out.println("cant divide by 0");
		}
		finally {
			System.out.println("program finished");
		}
		sc
	}

}
