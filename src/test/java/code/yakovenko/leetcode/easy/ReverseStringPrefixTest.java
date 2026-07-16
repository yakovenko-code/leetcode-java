package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ReverseStringPrefixTest {

	private final ReverseStringPrefix solution = new ReverseStringPrefix();

	@Test
	public void test1() {
		assertThat(solution.reversePrefix("abcd", 2)).isEqualTo("bacd");
	}

	@Test
	public void test2() {
		assertThat(solution.reversePrefix("xyz", 3)).isEqualTo("zyx");
	}

	@Test
	public void test3() {
		assertThat(solution.reversePrefix("hey", 1)).isEqualTo("hey");
	}
}
