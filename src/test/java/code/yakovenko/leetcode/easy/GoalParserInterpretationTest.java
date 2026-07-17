package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class GoalParserInterpretationTest {

	private final GoalParserInterpretation solution = new GoalParserInterpretation();

	@Test
	public void test1() {
		assertThat(solution.interpret("G()(al)")).isEqualTo("Goal");
	}

	@Test
	public void test2() {
		assertThat(solution.interpret("G()()()()(al)")).isEqualTo("Gooooal");
	}

	@Test
	public void test3() {
		assertThat(solution.interpret("(al)G(al)()()G")).isEqualTo("alGalooG");
	}
}
