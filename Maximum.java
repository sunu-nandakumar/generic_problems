package com.generic;

public class Maximum<T extends Comparable<T>> {
	
	T x, y, z;
	
	public Maximum(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	//determine the largest of three Comparable Objects
	public static <T extends Comparable<T>> T checkMaximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max) > 0) {
			max = y; // y is largest thus for
		}
		if(z.compareTo(max) > 0) {
			max = z; // z is largest now
		}
		printMax(max);
		return max; // returns maximum
	}

	public static String testMaximum(String x, String y, String z) {
		String max = x;
		if(y.compareTo(max) > 0) {
			max = y; // y is the largest so far
		}
		if(z.compareTo(max) > 0) {
			max = z; // z is the largest now
		}
		printMax( max);
		return max; // returns the largest so for
	}
	
	public static <T> void printMax(T max) {
		System.out.println("Max of Three  is" + max);
	}

	public static void main(String[] args) {
		Integer result = checkMaximum(10,23,15);
		Double value = checkMaximum(12.5, 13.4, 22.0);
		String a = "Apple", b = "peach", c = "Banana"; 
		Maximum.testMaximum(a, b, c);
		printMax(result);
		printMax(value);
	}

}
