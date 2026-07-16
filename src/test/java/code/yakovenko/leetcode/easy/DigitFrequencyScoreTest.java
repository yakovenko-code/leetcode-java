package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class DigitFrequencyScoreTest {

	private final DigitFrequencyScore solution = new DigitFrequencyScore();

	@Test
	public void test1() {
		assertThat(solution.digitFrequencyScore(122)).isEqualTo(5);
	}

	@Test
	public void test2() {
		assertThat(solution.digitFrequencyScore(101)).isEqualTo(2);
	}
}
