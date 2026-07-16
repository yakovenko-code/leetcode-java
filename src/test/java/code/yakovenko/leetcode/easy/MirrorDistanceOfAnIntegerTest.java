package code.yakovenko.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public final class MirrorDistanceOfAnIntegerTest {

	private final MirrorDistanceOfAnInteger solution = new MirrorDistanceOfAnInteger();

	@Test
	public void test1() {
		assertThat(solution.mirrorDistance(25)).isEqualTo(27);
	}

	@Test
	public void test2() {
		assertThat(solution.mirrorDistance(10)).isEqualTo(9);
	}

	@Test
	public void test3() {
		assertThat(solution.mirrorDistance(7)).isEqualTo(0);
	}
}
