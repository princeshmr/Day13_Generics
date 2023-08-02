package com.Day13_Generics;

public class GenericsUC3 {

	public static void main(String[] args) {
		String x="Apple";
		String y="Peach";
		String z="Banana";
		
		testMaximum(x,y,z);
	}

	private static String testMaximum(String x, String y, String z) {
		String max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		printMax(x,y,z,max);
		return max;	
	}

	private static void printMax(String x, String y, String z, String max) {
		System.out.println("Maximum String of "+x+","+y+","+z+" is "+max);
		
	}

}
