package com.generic;

public class Maximum {
	//calculating Maximum of Three Numbers using CompareTo method
	// Claculating Maximum of 3 Integers, Floating point, Strings
		public static <T extends Comparable<T>> T checkMaximum(T x, T y, T z) {
			T max = x;
			if(y.compareTo(max) > 0) {
				max = y; // y is maximum now
			}
			if(z.compareTo(max) > 0) {
				max = z; // z is maximum now
			}
			return max; // returns maximum value
		}
		
		public static <T extends Comparable<T>> T checkMaximum_With_MoreThan_ThreeParameters(T... elements) {
			T max = elements[0];
			for(T maximumParametereter : elements) {
				if(maximumParametereter.compareTo(max) > 0) {
					max = maximumParametereter;
				}
			}
			return max;
		}

		public static void main(String[] args) {
			Integer value = checkMaximum(10,23,15);
			Double result = checkMaximum(12.5, 13.4, 22.0);
			String fruitMax = checkMaximum("Apple", "Peach", "Banana");
			Integer valueForThanThree = checkMaximum_With_MoreThan_ThreeParameters(10,23,15,20,24);
			Double resultForThanThree = checkMaximum_With_MoreThan_ThreeParameters(12.5, 13.4, 22.0,24.0,20.8);
			String fruitForThanThree = checkMaximum_With_MoreThan_ThreeParameters("Apple", "Peach", "Banana", "Mango", "Orange"); 
			System.out.println(value);
			System.out.println(result);
			System.out.println(fruitMax);
			System.out.println(valueForThanThree);
			System.out.println(resultForThanThree);
			System.out.println(fruitForThanThree);
		}

}
