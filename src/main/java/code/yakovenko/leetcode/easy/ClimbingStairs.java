package code.yakovenko.leetcode.easy;

public final class ClimbingStairs {

	public int climbStairs(int n) {
		if (n <= 2) return n;

		final int[] data = new int[n];

		data[0] = 1;
		data[1] = 2;

		for (int i = 2; i < n; i++) {
			data[i] = data[i - 1] + data[i - 2];
		}

		return data[n - 1];
	}
}
