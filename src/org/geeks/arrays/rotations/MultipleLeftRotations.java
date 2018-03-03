package org.geeks.arrays.rotations;

public class MultipleLeftRotations {
	
	private static void multipleRotation(int arr[],int k,int n) {
		int mod= k%n;
		for(int i=0;i<n;i++) {
			System.out.print(arr[(i+mod)%n]+"  ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
	MultipleLeftRotations obj = new MultipleLeftRotations();
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	multipleRotation(arr,3,10);
	multipleRotation(arr,5,10);
	multipleRotation(arr,7,10);
	}
}
