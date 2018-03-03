package org.geeks.arrays.rotations;

public class CountRotationsDivBy8 {

	private int rotateCount(int arr[],int n) {
		int count=0;
		int len = arr.length;
		if(len==0)
			return  0;
		if(len==1 && arr[0]%8==0) {
			return 1;
		}
		if(len==2 ) {
			if((arr[1]*10+arr[0])%8==0)
				count++;
			if((arr[0]*10+arr[1])%8==0)
				count ++;
			return count;
		}
		for(int i=0;i<len-2;i++) {
			int digit = arr[i]*100+arr[i+1]*10+arr[i+2];
			if(digit%8==0)
				count++;
		}
		//number formed by last 2 digits and first digit
		if((arr[len-2]*100+arr[len-1]*10+arr[0])%8==0)
			count++;
		//number formed by last digit and first 2 digits 
				if((arr[len-1]*100+arr[0]*10+arr[1])%8==0)
					count++;

		return count;
	}

	public static void main(String[] args) {
		CountRotationsDivBy8 obj = new CountRotationsDivBy8();
		String s= "43262488612";
		int arr[]= new int[s.length()];
		for(int i=0;i<s.length();i++) {
			arr[i] = Integer.parseInt(s.substring(i, i+1));
		
		}
		System.out.println(obj.rotateCount(arr,arr.length));

	}

}
