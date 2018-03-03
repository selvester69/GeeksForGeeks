package org.geeks.arrays.rotations;

public class PrintArray {

	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println();
	}

	
	public static void displayMatrix(int matrix[][]){
		int m= matrix.length;
		int n= matrix[0].length;
		for (int i = 0; i < m; i++){
			for (int j = 0; j < n ; j++)
				System.out.print(matrix[i][j] + " ");
			System.out.println();
		}
	} 

}
