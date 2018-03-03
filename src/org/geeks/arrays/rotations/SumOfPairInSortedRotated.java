package org.geeks.arrays.rotations;

public class SumOfPairInSortedRotated {
	
	private boolean pairSumInSortedRotatedArray(int arr[], int sum) {
		//find pivot
		int n = arr.length;
		int i;
		for(i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1])
				break;
		}
		System.out.println("pivot = "+(i+1));
		//i becomes pivoit;
		int low = (i+1)% n;
		int high = i;
		while(low!=high) {
			if(arr[low]+arr[high]==sum)
				return true;
			if(arr[low]+arr[high]<sum)
				low = (low+1)%n;
			else
				high = (high+n-1)%n;
		}
		return false;
	}
	
	public static void main(String[] args) {
		SumOfPairInSortedRotated obj = new SumOfPairInSortedRotated();
		int arr[] = {4,5,6,7,8,9,1,2,3};
		int sum = 0;
		System.out.println(obj.pairSumInSortedRotatedArray(arr, sum));
	}

}
