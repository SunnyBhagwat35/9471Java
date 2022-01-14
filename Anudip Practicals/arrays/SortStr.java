package array;

import java.util.Scanner;

public class SortStr {
	
	public static void sortStr(char[] arr, int n) {
		for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    char temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length:");
		int n = sc.nextInt();
		
		char[] arr = new char[n];
		for(int i=0 ; i < n; i++) {
			arr[i] = sc.next().charAt(0);	
		}
		
		
		for(int j=0; j<n; j++) {
			System.out.print(arr[j]+" ");
		}
		
		sortStr(arr, n);
		System.out.println("sorted array is: ");
		for(int j=0; j<n; j++) {
			System.out.print(arr[j]+" ");
		}
	}

}
