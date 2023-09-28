package medium;

/**
 * https://leetcode.com/problems/rotate-list/
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0) return head;
        ListNode currency, kPointer;
        currency = kPointer = head;
        int diff = 0;

        int size = 0;
        while (currency != null) {
            size++;
            currency = currency.next;
        }

        if (size == 0 || k % size == 0) return head;
        if (k > size) return rotateRight(head, k % size);

        currency = head;
        while ((currency.next != null) && diff < k) {
            diff++;
            currency = currency.next;
        }

        /*   1 -> 2 -> 3 -> 4 -> 5 и k = 2
             -----------------------------
             1----2----3 -> 4 -> 5 : currency (future 5 node)
             1 -> 2 -> 3-->diff<-- : kPointer (future 3 node)
             То есть kPointer всегда будет отставать на diff (k)
             Тогда можно будет узнать k эл. с конца и сделать его в буд. головой
             А также узнать полслений узел и связать его с нынешней головой */

        while (currency.next != null) {
            currency = currency.next;
            kPointer = kPointer.next; // отстает на k эл. от currency
        }

        // kPointer - это эл. перед k - ым с конца, а next - это уже k - ый (новая голова)
        ListNode newHead = kPointer.next;
        kPointer.next = null; // обрываем связь между k - ым с конца эл. и тем, что перед ним
        currency.next = head; // связываем нынешний последний с первыми до k - ого с конца (ненышняя глова)
        return newHead;
    }

    /**
     * ! Медленный для большого k
     */
    public ListNode rotateRightAlter(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        int round = 1;
        ListNode headNode = head;
        while (round <= k) {
            ListNode rightNode = headNode;
            ListNode preRightNode = null;
            while (rightNode.next != null) {
                if (rightNode.next.next == null) {
                    preRightNode = rightNode;
                }
                rightNode = rightNode.next;
            }
            preRightNode.next = null;
            rightNode.next = headNode;
            headNode = rightNode;
            round++;
        }
        return headNode;
    }


    private class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

