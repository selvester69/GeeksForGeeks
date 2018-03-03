package org.geeks.arrays.rotations;

public class CyclicallyRotateOneByOne {

	private void rotateCyclically(int arr[],int n) {
		int temp = arr[n-1];
		for(int i=n-1;i>0;i--)
			arr[i]=arr[i-1];
		arr[0] = temp;
	}


	public static void main(String[] args) {
		CyclicallyRotateOneByOne obj = new CyclicallyRotateOneByOne();
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		obj.rotateCyclically(arr, arr.length);
		PrintArray.print(arr);
	}

}
