package axceptionHandling;

import java.util.Scanner;

public class mutiCatch {

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
			
			int[] arr ={1,2};
			System.out.println(arr[5]+" "+arr.length);
		}
		catch(ArithmeticException e){
			System.out.println("cant divide by 0");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Your array legth is only 2");
		}
		finally {
			System.out.println("program finished");
		}

	}

}
