package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class FindFirstPalindromicStringInTheArrayTest {

	private final FindFirstPalindromicStringInTheArray solution = new FindFirstPalindromicStringInTheArray();

	@Test
	public void test1() {
		assertThat(solution.firstPalindrome(new String[]{"abc", "car", "ada", "racecar", "cool"})).isEqualTo("ada");
	}

	@Test
	public void test2() {
		assertThat(solution.firstPalindrome(new String[]{"notapalindrome", "racecar"})).isEqualTo("racecar");
	}

	@Test
	public void test3() {
		assertThat(solution.firstPalindrome(new String[]{"def", "ghi"})).isEqualTo("");
	}
}
