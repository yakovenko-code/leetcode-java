package code.yakovenko.leetcode.easy;

public final class ReverseString {

	public void reverseString(char[] s) {
		for (int i = 0; i < s.length / 2; i++) {
			final char tmp = s[i];
			s[i] = s[s.length - 1 - i];
			s[s.length - 1 - i] = tmp;
		}
	}
}
