package com.danielmelo.datastructures.arrays;

public class BiDimensionalArrayDS {

	public static int findMaxSum(int[][] matrix) {
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				sum = (matrix[i][j] + matrix[i][j + 1] + matrix[i][j + 2]) + (matrix[i + 1][j + 1])
						+ (matrix[i + 2][j] + matrix[i + 2][j + 1] + matrix[i + 2][j + 2]);
				maxSum = Math.max(maxSum, sum);
				sum = 0;
			}
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int[][] matrix = {
				{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}
		};

		int maxSum = findMaxSum(matrix);

		System.out.println(maxSum);

	}
}
