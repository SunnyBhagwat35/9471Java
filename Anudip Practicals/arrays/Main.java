package array;
import java.util.Scanner;




public class Main {
static int n;
static int[] arr;

	static void getAvg() {
		int avg = 0;
		for(int i=0; i<n; i++) {
			avg += arr[i];
		}
		System.out.println("average is: "+avg/n);
	}
	static void getMax() {
		int max = arr[0];
		for(int i=0; i<n; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Gretest of all is: "+max);
	}
	
	static void sortAsc() {
		for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
		}
	}
	
	static void sortDsc() {
		for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }	
		}
	static void contains(int val) {
		for(int i=0; i<n; i++) {
			if(arr[i] == val) {
				System.out.print(val+" is present in array");
				return;			
			}
		}
		System.out.print(val+" is not present in array");
		

	}
	
	static void getIndex(int val) {
		for(int i=0; i<n; i++) {
			if(arr[i] == val) {
				System.out.print("index of "+val+" is at index "+ i);
				return;			
			}
		}
		System.out.print("index of "+val+" is not present in array");
		
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter size of array: ");
		n = sc.nextInt();
		
//		int[] arr = new int[n];
		
		arr = new int[n];
		
		System.out.print("Enter array elements:");
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print("Entered Array: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		getAvg();
		getMax();
		
		sortAsc();
		System.out.print("\narray in ascending order: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}

		sortDsc();
		System.out.print("\narray in descending order: ");
		for(int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
		}
		
		getIndex(4);
		contains(9);
	}
}
