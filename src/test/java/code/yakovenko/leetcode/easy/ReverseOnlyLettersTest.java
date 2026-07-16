package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ReverseOnlyLettersTest {

	private final ReverseOnlyLetters solution = new ReverseOnlyLetters();

	@Test
	public void test1() {
		assertThat(solution.reverseOnlyLetters("ab-cd")).isEqualTo("dc-ba");
	}

	@Test
	public void test2() {
		assertThat(solution.reverseOnlyLetters("a-bC-dEf-ghIj")).isEqualTo("j-Ih-gfE-dCba");
	}

	@Test
	public void test3() {
		assertThat(solution.reverseOnlyLetters("Test1ng-Leet=code-Q!")).isEqualTo("Qedo1ct-eeLg=ntse-T!");
	}
}
