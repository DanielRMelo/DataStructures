package com.danielmelo.datastructures.arrays;

public class ArraysDS {

	static int[] reverseArray(int[] a) {
		int[] arr = new int[a.length];
		for (int i = a.length - 1, x = 0; i >= 0; i--, x++) {
			arr[x] = a[i];
		}
		return arr;
	}
}
