package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class PalindromeNumberTest {

	private final PalindromeNumber solution = new PalindromeNumber();

	@Test
	public void test1() {
		assertThat(solution.isPalindrome(121)).isTrue();
	}

	@Test
	public void test2() {
		assertThat(solution.isPalindrome(-121)).isFalse();
	}

	@Test
	public void test3() {
		assertThat(solution.isPalindrome(10)).isFalse();
	}
}
