package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ComplementOfBase10IntegerTest {

	private final ComplementOfBase10Integer solution = new ComplementOfBase10Integer();

	@Test
	public void test1() {
		assertThat(solution.bitwiseComplement(5)).isEqualTo(2);
	}

	@Test
	public void test2() {
		assertThat(solution.bitwiseComplement(7)).isEqualTo(0);
	}

	@Test
	public void test3() {
		assertThat(solution.bitwiseComplement(10)).isEqualTo(5);
	}
}
