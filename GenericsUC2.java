package com.Day13_Generics;

public class GenericsUC2 {

	public static void main(String[] args) {
		Float x=60.5f;
		Float y=80.5f;
		Float z=30.5f;
		
		testMaximum(x,y,z);

	}

	private static Float testMaximum(Float x, Float y, Float z) {
		Float max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
		
		
	}

	private static void printMax(Float x, Float y, Float z, Float max) {
		System.out.println("Maximum number of "+x+","+y+","+z+" is "+max);
		
	}

}
