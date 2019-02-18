package com.danielmelo.datastructures.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class BiDimensionalArrayDSTest {

	@Test
	void findMaxSumTest() {
		int[][] matrix = {
				{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}
		};

		int result = BiDimensionalArrayDS.findMaxSum(matrix);
		int expected = 19;
		assertEquals(expected, result);
	}

	@Test
	void findMaxSumTest2() {
		int[][] matrix = {
				{0, -4, -6, 0, -7, -6},
				{-1, -2, -6, -8, -3, -1},
				{-8, -4, -2, -8, -8, -6},
				{-3, -1, -2, -5, -7, -4},
				{-3, -5, -3, -6, -6, -6},
				{-3, -6, 0, -8, -6, -7}
		};

		int result = BiDimensionalArrayDS.findMaxSum(matrix);
		int expected = -19;
		assertEquals(expected, result);
	}
}
