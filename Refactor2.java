package com.Day13_Generics;

public class Refactor2<T> {    //Create Generic class

    public static<E extends Comparable<E>> E testMaximum(E x,E y, E z) {
		E max=x;                       //assume x is initially the largest
		if(y.compareTo(max)>0) {
			max=y;                    // y is the largest so far
		}
		if(z.compareTo(max)>0) {
			max=z;                    // z is the largest 
		}
		return max;                  // returns the largest object 	
	}

	public static void main(String[] args) {
		 Refactor2<Integer>obj1=new Refactor2<Integer>();             //Create Generic Integer type constructor
   	     System.out.println(obj1.testMaximum(10,20,40));           //I call the testMaximum()passing the 3 integer value
   	     Refactor2<Float>obj2=new Refactor2<Float>();
   	     System.out.println(obj2.testMaximum(10.5f,20.5f,30.5f));
   	     Refactor2<String>obj3=new Refactor2<String>();
   	     System.out.println(obj3.testMaximum("Apple","Peach","Banana"));
        
	}

}
