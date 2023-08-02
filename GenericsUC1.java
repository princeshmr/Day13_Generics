package com.Day13_Generics;

public class GenericsUC1{
	
	public static void main(String[] args) {
		Integer x=10;
		Integer y=40;
		Integer z=30;
		
		testMaximum(x,y,z);	
	}
	private static int testMaximum(Integer x, Integer y, Integer z) {
		Integer max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;
		
	}

	private static void printMax(Integer x, Integer y, Integer z, Integer max) {
		System.out.println("Maximum number of "+x+","+y+","+z+" is "+max);
		
	}

	

}
