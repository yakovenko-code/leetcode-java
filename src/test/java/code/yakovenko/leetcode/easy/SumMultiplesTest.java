package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class SumMultiplesTest {

	private final SumMultiples solution = new SumMultiples();

	@Test
	public void test1() {
		assertThat(solution.sumOfMultiples(7)).isEqualTo(21);
	}

	@Test
	public void test2() {
		assertThat(solution.sumOfMultiples(10)).isEqualTo(40);
	}

	@Test
	public void test3() {
		assertThat(solution.sumOfMultiples(9)).isEqualTo(30);
	}
}
