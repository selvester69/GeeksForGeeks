package org.geeks.arrays.rotations;

public class RotationWithMaxHammingDistance {
	
	private int maxHammingDistance(int arr[],int n){
		int brr[] = new int[2*n+1];
		for(int i=0;i<n;i++) {
			brr[i] = brr[n+i] = arr[i];
		}
		int maxHam = 0;
		for(int i=1;i<n;i++) {
			int currHam = 0;
			for(int j=i,k=0;j<(n+i);j++,k++) {
				if(brr[j]!=arr[k])
					currHam++;
				if(currHam==n)
					return n;
				maxHam = Math.max(currHam, maxHam);
			}
		}
		return maxHam;
	}
	
	
	public static void main(String[] args) {
		RotationWithMaxHammingDistance  obj = new RotationWithMaxHammingDistance();
		int arr[]= {6,7,8,9,10,1,2,3,4,5};
	int res = obj.maxHammingDistance(arr, arr.length);
	System.out.println(res);
	}

}
