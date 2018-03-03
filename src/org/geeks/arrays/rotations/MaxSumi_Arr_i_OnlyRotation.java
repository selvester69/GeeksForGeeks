package org.geeks.arrays.rotations;

public class MaxSumi_Arr_i_OnlyRotation {
	
	private int maxSum(int arr[]) {
		int arrsum = 0;
		int currval = 0;
		for(int i=0;i<arr.length;i++) {
			arrsum +=arr[i];
			currval = currval +(i*arr[i]);
		}
		int maxval = currval;
		for(int i=1;i<arr.length;i++) {
			currval = currval+arrsum-arr.length*arr[arr.length-i];
			//currVal = currVal + arrSum-n*arr[n-j];
			if(maxval<currval)
				maxval = currval;
		}
		return maxval;
	}
	
	
	public static void main(String[] args) {
		MaxSumi_Arr_i_OnlyRotation obj = new MaxSumi_Arr_i_OnlyRotation();
		int arr[] = {4,5,6,7,8,9,1,2,3};
		int sum = 0;
		obj.maxSum(arr);
	}

}
