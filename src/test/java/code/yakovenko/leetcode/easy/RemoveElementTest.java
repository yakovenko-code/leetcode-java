package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public final class RemoveElementTest {

	private final RemoveElement solution = new RemoveElement();

	@Test
	public void example1() {
		final int[] nums = {3, 2, 2, 3};
		final int val = 3;
		final int[] expectedNums = {2, 2};

		final int k = solution.removeElement(nums, val);

		assertThat(k).isEqualTo(expectedNums.length);
		Arrays.sort(nums, 0, k);
		for (int i = 0; i < expectedNums.length; i++) {
			assertThat(nums[i]).isEqualTo(expectedNums[i]);
		}
	}

	@Test
	public void example2() {
		final int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
		final int val = 2;
		final int[] expectedNums = {0, 0, 1, 3, 4};

		final int k = solution.removeElement(nums, val);

		assertThat(k).isEqualTo(expectedNums.length);
		Arrays.sort(nums, 0, k);
		for (int i = 0; i < expectedNums.length; i++) {
			assertThat(nums[i]).isEqualTo(expectedNums[i]);
		}
	}
}
