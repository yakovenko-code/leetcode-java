package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class ConvertTheTemperatureTest {

	private final ConvertTheTemperature solution = new ConvertTheTemperature();

	@Test
	public void test1() {
		assertThat(solution.convertTemperature(36.5)).isEqualTo(new double[]{309.65, 97.7});
	}

	@Test
	public void test2() {
		assertThat(solution.convertTemperature(122.11)).isEqualTo(new double[]{395.26, 251.798});
	}
}
