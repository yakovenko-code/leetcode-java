package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class AddTwoIntegersTest {

	private final AddTwoIntegers solution = new AddTwoIntegers();

	@Test
	public void test1() {
		assertThat(solution.sum(12, 5)).isEqualTo(17);
	}

	@Test
	public void test2() {
		assertThat(solution.sum(-10, 4)).isEqualTo(-6);
	}
}
