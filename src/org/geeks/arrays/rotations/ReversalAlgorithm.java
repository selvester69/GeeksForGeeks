package org.geeks.arrays.rotations;

public class ReversalAlgorithm {

	private void reverse(int arr[],int start,int end) {
		while(start<end) {
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;end--;
		}
	}
	private void reverseArray(int arr[],int d) {
		int n=arr.length;
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
		PrintArray.print(arr);
	}
	
	public static void main(String[] args) {
		ReversalAlgorithm reverse = new ReversalAlgorithm();
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		reverse.reverseArray(arr, 3);
	}
}
