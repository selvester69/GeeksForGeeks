package org.geeks.arrays.rotations;

public class ArrayRotation {
	
	
	private void rotateArrayMethod1(int arr[],int d) {
		int temp[] = new int[d];
		int a=d;
		int i=0;
		while(d>0) {
			temp[i]=arr[i];
			i++;
			d--;
		}
		int j=0;
		for(;j<arr.length-a;j++,i++) {
			arr[j]=arr[i];
		}
		i=0;
 		while(j<arr.length) {
			arr[j]=temp[i];
			i++;
			j++;
		}
		PrintArray.print(arr);
	}
	
	private void rotateArrayMethod2(int arr[],int d) {
		for(int i=0;i<d;i++) {
			int temp = arr[0],j=0;
			for(j=0;j<arr.length-1;j++)
				arr[j] = arr[j+1];
			arr[j] = temp;
		}
		PrintArray.print(arr);
	}
	
	private int gcd(int a,int b) {
		if(b==0)
			return a;
		return gcd( b,a % b);
	}
	
	private void rotateArrayMethod3(int arr[],int d) {
		int n= arr.length;
		int i,j,k,temp;
		for(i=0;i<gcd(d,n);i++) {
			temp=arr[i];
			j=i;
			while(true) {
				k=j+d;
				if(k>=n) k=k-n;
				if(k==i) break;
				arr[j] = arr[k];
				j=k;
			}
			arr[j] = temp;
		}
		PrintArray.print(arr);
	}
	
	
	public static void main(String[] args) {
		ArrayRotation arrObject = new ArrayRotation();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		arrObject.rotateArrayMethod1(arr.clone(), 3);
		arrObject.rotateArrayMethod2(arr.clone(), 3);
		arrObject.rotateArrayMethod3(arr.clone(), 3);
	}

}
