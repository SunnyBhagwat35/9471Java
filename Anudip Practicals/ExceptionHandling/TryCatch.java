package axceptionHandling;
//import java.io.*;
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[] = new int[2];
			System.out.println(arr[3]);
		}
		catch(Exception e) {
			System.out.println("Error Occurred: "+ e);
		}
		System.out.println("Out of Try Catch");

	}

}
