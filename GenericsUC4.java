package com.Day13_Generics;

public class GenericsUC4 {

	public static void main(String[] args) {
		Integer a=20;
		Integer b=10;
		Integer c=70;
		Integer d=50;
		
		testMaximum(a,b,c,d);	

	}

	private static Integer testMaximum(Integer a, Integer b, Integer c, Integer d) {
		Integer max=a;
		if(b.compareTo(max)>0) {
			max=a;
		}
		if(c.compareTo(max)>0) {
			max=c;
		}
		if(d.compareTo(max)>0) {
			max=d;
		}
		toPrint(a,b,c,d,max);
		return max;
		
	}

	private static void toPrint(Integer a, Integer b, Integer c, Integer d, Integer max) {
		System.out.println(max);
		
	}

}
