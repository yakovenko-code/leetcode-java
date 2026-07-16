package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class HarshadNumberTest {

	private final HarshadNumber solution = new HarshadNumber();

	@Test
	public void test1() {
		assertThat(solution.sumOfTheDigitsOfHarshadNumber(18)).isEqualTo(9);
	}

	@Test
	public void test2() {
		assertThat(solution.sumOfTheDigitsOfHarshadNumber(23)).isEqualTo(-1);
	}
}
