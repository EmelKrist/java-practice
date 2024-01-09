package easy;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 */
public class RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentRoot = head;
        while (currentRoot != null && currentRoot.next != null) {
            if (currentRoot.val == currentRoot.next.val) {
                currentRoot.next = currentRoot.next.next;
            } else {
                currentRoot = currentRoot.next;
            }
        }
        return head;
    }

    private class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
