package code.yakovenko.leetcode.easy;

public final class ReverseVowelsOfAString {

	private static final boolean[] IS_VOWEL = new boolean[256];

	static {
		for (char c : "aeiouAEIOU".toCharArray()) {
			IS_VOWEL[c] = true;
		}
	}

	public String reverseVowels(String s) {
		int left = 0, right = s.length() - 1;
		char[] chars = s.toCharArray();

		while (left < right) {
			while (left < right && !IS_VOWEL[chars[left]]) {
				left++;
			}

			while (left < right && !IS_VOWEL[chars[right]]) {
				right--;
			}

			char tmp = chars[left];
			chars[left++] = chars[right];
			chars[right--] = tmp;
		}

		return new String(chars);
	}
}
