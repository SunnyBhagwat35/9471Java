package array;

import java.util.Scanner;

import java.util.Arrays;

public class MultiDArray {

	static int[][] transpose() {
		int[][] transposed = new int[row][col];
		for(int i =0; i < row; i++) {
			for(int j =0; j < col; j++) {
				transposed[i][j] = arr[j][i];
			}
		}
		return transposed;
	}
	
	static int[][] sorted(){
		int[][] s = arr.clone();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				for(int k = 0; k < col - j - 1; k++) {
					if(s[i][k] > s[i][k+1]) {
						int temp = s[i][k];
						s[i][k] = s[i][k+1];
						s[i][k+1] = temp;
					}
				}
			}
		}
		
		return s;
	}
	
		
	
	static int row, col;
	static int[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows:");
		row = sc.nextInt();
		
		System.out.println("Enter Cols:");
		col = sc.nextInt();
		
		System.out.println("Enter "+ (row+col) +" numbers for array: ");
		arr = new int[row][col];
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Transpose of matrix: ");
		for(int i=0; i<row; i++) {
			System.out.println(Arrays.toString(transpose()[i]));
		}
		
		System.out.println("Our sorted matrix: ");
		int[][] s = sorted();
		for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[i].length; j++)
                System.out.print(s[i][j] + " ");
            System.out.println();
        }
		sc.close();


	}

}
