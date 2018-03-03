package org.geeks.arrays.rotations;

/**
 * Given two positive integers x and y, check if one integer is obtained by rotating bits of other.
 * */
public class Check2NumberAreBitRotationOfEachOther {
	
	private static boolean isRotations(int x,int y) {
		while(x>>1 !=x) {
		if((x>>1)==y)
			return true;
		x>>=1;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int x = 16;
	    int y = 1;
	    System.out.println("number are rotations of eachother "+isRotations(x,y));
	    x= 7995392;
	    y = 122; 
	    System.out.println("number are rotations of eachother "+isRotations(x,y));
	}

}
