package array;

import java.util.Scanner;

public class MatrixAddition {
	static int row, col;
	static int[][] arr2;
	static int[][] arr1;
	
	static int[][] addMatrix(){
		int[][] c = new int[row][col];
		
		for(int i=0; i < row; i++) {
			for(int j=0; j<col; j++) {
				c[i][j]= arr1[i][j] + arr2[i][j];
			}
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter rows:");
		row = sc.nextInt();
		
		System.out.println("Enter Cols:");
		col = sc.nextInt();
		
		arr1 = new int[row][col];
		arr2 = new int[row][col];
		System.out.println("Enter "+ (row+col) +" numbers for array 1: ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter "+ (row+col) +" numbers for array 2: ");
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		int[][] c = addMatrix();
		for(int i=0; i < row; i++) {
			for(int j=0; j<col; j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}

}
