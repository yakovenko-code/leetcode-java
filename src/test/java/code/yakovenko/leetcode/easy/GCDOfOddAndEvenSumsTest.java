package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class GCDOfOddAndEvenSumsTest {

	private final GCDOfOddAndEvenSums solution = new GCDOfOddAndEvenSums();

	@Test
	public void test1() {
		assertThat(solution.gcdOfOddEvenSums(4)).isEqualTo(4);
	}

	@Test
	public void test2() {
		assertThat(solution.gcdOfOddEvenSums(5)).isEqualTo(5);
	}
}
