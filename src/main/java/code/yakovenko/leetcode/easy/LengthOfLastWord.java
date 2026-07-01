package code.yakovenko.leetcode.easy;

public final class LengthOfLastWord {

	public int lengthOfLastWord(String s) {
		int i = s.length() - 1;
		int maxLength = 0;

		while (i >= 0 && s.charAt(i) == ' ') {
			i--;
		}

		while (i >= 0 && s.charAt(i) != ' ') {
			i--;
			maxLength++;
		}

		return maxLength;
	}
}
