class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || left == right) {
            return head;
        }

        int pos = 1;
        ListNode before = null;
        ListNode temp = head;

        while (pos < left) {
            before = temp;
            temp = temp.next;
            pos++;
        }

        ListNode current = temp;
        ListNode previous = null;
        int times = right - left + 1;

        while (times > 0) {
            ListNode next = current.next;
            current.next = previous;
            previous = current;
            current = next;
            times--;
        }

        temp.next = current;

        if (before != null) {
            before.next = previous;
        } else {
            head = previous;
        }

        return head;
    }
}