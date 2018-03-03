package org.geeks.arrays.rotations;

public class SearchInSortedAndRotatedArray {

	private int pivotBinarySearch(int arr[],int n,int key) {
		int pivot = findPivot(arr, 0, n-1);
		if(pivot==-1)
			return binarySearch(arr, 0, n-1, key);
		if(arr[pivot]==key)
			return pivot;
		if(arr[0]<=key)
			return binarySearch(arr, 0,pivot, key);
		return binarySearch(arr, pivot+1, n-1, key);
		
	}
	
	private int findPivot(int arr[],int low,int high) {
		if(high<low)
			return -1;
		if(low==high)
			return low;
		int mid = (low+high)/2;
		if(mid<high && arr[mid]>arr[mid+1])
			return mid;
		if(mid>low && arr[mid]<arr[mid-1])
			return mid-1;
		if(arr[low]>=arr[mid])
			return findPivot(arr, low, mid-1);
		return findPivot(arr, mid+1, high);
	}
	
	
	
	private int binarySearch(int arr[],int low,int high,int key) {
		if(high<low)
			return -1;

		int mid = (low+high)/2;
		if(key==arr[mid])
			return mid;
		if(key<arr[mid])
			return binarySearch(arr, low, mid-1, key);
		return binarySearch(arr, mid+1, high, key);
	}

	public static void main(String[] args) {
		SearchInSortedAndRotatedArray obj = new SearchInSortedAndRotatedArray();
		int arr[]= {6,7,8,9,10,1,2,3,4,5};
		int res = obj.pivotBinarySearch(arr, arr.length,6);
		PrintArray.print(arr);
		System.out.println(res);
		int res2 = obj.SearchImproved(arr,0, arr.length-1,10);
		System.out.println(res2);
	}
	
	private int SearchImproved(int arr[],int l, int h, int key) {
		if(h<l)
			return -1;
		int mid = (l+h)/2;
		if(arr[mid]==key)
			return mid;
		if(arr[l]<=arr[mid]) { //arr[l...mid] is sorted
			if(key>=arr[l] && key<=arr[mid])
				return SearchImproved(arr, l, mid-1, key);
			return SearchImproved(arr, mid+1, h, key);
		}
		if(key>=arr[mid] && key<=arr[h]) 
			return SearchImproved(arr, mid+1, h, key);
		return SearchImproved(arr, l, mid-1, key);
	}
}
