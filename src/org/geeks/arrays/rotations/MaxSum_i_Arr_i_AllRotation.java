package org.geeks.arrays.rotations;

public class MaxSum_i_Arr_i_AllRotation {

	private int maxSum(int arr[]) {
		int sum = 0;
		int len = arr.length;
		int currVal = 0;
		for(int i=0;i<len;i++) {
			sum+=arr[i];
			currVal += i*arr[i];
		}
		int res = currVal;
		for(int i=1;i<len;i++) {
			currVal = currVal-(sum-arr[i])+arr[i-1]*(len-1);
			System.out.println("currVal "+currVal);
			res = Math.max(res, currVal);
		}
		return res;
	}


	public static void main(String[] args) {
		MaxSum_i_Arr_i_AllRotation obj = new MaxSum_i_Arr_i_AllRotation();
		int arr[] = {4,5,6,7,8,9,1,2,3};
		int res = obj.maxSum(arr);
		System.out.println(res);
	}

}
