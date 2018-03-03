package org.geeks.arrays.rotations;

public class BlockSwapForArrayRotation {
	
	private void blockSwap(int arr[],int f,int s,int d) {
		int i,temp;
		for(i=0;i<d;i++) {
			temp = arr[f+i];
			arr[f+i] = arr[s+i];
			arr[s+i]  = temp;
		}
	}
	
	private void rotateLeftIterative(int arr[],int d, int n) {
		int i,j;
		if(d==0 || d==n)
			return;
		i=d;
		j=n-d;
		while(i!=j) {
			if(i<j) {
				blockSwap(arr, d-i, d+j-i, i);
				j -=i;
			} else {
				blockSwap(arr, d-i, d, j);
				i -=j;
			}
		}
		blockSwap(arr, d-i, d, i);
	}



	public static void main(String[] args) {
		BlockSwapForArrayRotation swap = new BlockSwapForArrayRotation();
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		swap.rotateLeftIterative(arr, 9,arr.length);
		PrintArray.print(arr);
	}
}
