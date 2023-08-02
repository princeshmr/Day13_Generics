package com.Day13_Generics;

public class Refactor1 {

	public static void main(String[] args) {
		System.out.println(testMaximum(10,30,20));
		System.out.println(testMaximum(20.5f,30.5f,40.5f));
		System.out.println(testMaximum("Apple","Peach","Banana"));
	}

	public static<E extends Comparable<E>> E testMaximum(E x,E y, E z) {
		E max=x;
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		return max;
		
	}

}	


