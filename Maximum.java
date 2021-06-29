package com.generic;

public class Maximum {
	//calculating Maximum of Three Numbers using CompareTo method
		public static int checkMaximum(Integer x, Integer y, Integer z) {
			Integer max = x;
			if(y.compareTo(max) > 0) {
				max = y; // y is largest now
			}
			if(z.compareTo(max) > 0) {
				max = z; // z is largest now
			}
			return max; // returns maximum number
		}

		public static void main(String[] args) {
			int value = checkMaximum(10,23,15);
			System.out.println(value);
		}


}
