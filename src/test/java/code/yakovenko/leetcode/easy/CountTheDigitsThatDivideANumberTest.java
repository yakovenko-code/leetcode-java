package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class CountTheDigitsThatDivideANumberTest {

	private final CountTheDigitsThatDivideANumber solution = new CountTheDigitsThatDivideANumber();

	@Test
	public void test1() {
		assertThat(solution.countDigits(7)).isEqualTo(1);
	}

	@Test
	public void test2() {
		assertThat(solution.countDigits(121)).isEqualTo(2);
	}

	@Test
	public void test3() {
		assertThat(solution.countDigits(1248)).isEqualTo(4);
	}
}
