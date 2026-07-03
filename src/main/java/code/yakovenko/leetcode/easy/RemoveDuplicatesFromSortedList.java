package code.yakovenko.leetcode.easy;

import code.yakovenko.leetcode.utils.ListNode;

public final class RemoveDuplicatesFromSortedList {

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null) return null;

		ListNode previous = head, current = previous.next;

		while (current != null) {
			if (previous.val == current.val) {
				previous.next = current.next;
			} else {
				previous = current;
			}

			current = current.next;
		}

		return head;
	}
}
