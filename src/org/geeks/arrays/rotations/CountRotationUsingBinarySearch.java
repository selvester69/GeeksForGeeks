package org.geeks.arrays.rotations;

public class CountRotationUsingBinarySearch {
	
	private int countRotation(int arr[],int low,int high) {
		if(high<low) 
			return 0;
		if(high==low)
			return low;
		int mid = (low+high)/2;
		if(mid < high && arr[mid+1] < arr[mid])
			return mid+1;
		if(mid>low && arr[mid]<arr[mid-1])
			return mid;
		if(arr[high]>arr[mid])
			return countRotation(arr, low, mid-1);
		return countRotation(arr, mid+1, high);
	}
	
	public static void main(String[] args) {
		CountRotationUsingBinarySearch obj = new CountRotationUsingBinarySearch();
		int arr[] = {4,5,6,7,8,9,1,2,3};
		System.out.println("rotations = "+obj.countRotation(arr,0,arr.length-1));
		
		
	}

}
