public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int lenA = 0;
        ListNode tempA = headA;

        while (tempA != null) {
            lenA++;
            tempA = tempA.next;
        }

        int lenB = 0;
        ListNode tempB = headB;

        while (tempB != null) {
            lenB++;
            tempB = tempB.next;
        }

        int diff = Math.abs(lenA - lenB);

        if (lenA > lenB) {
            while (diff > 0) {
                headA = headA.next;
                diff--;
            }
        } else {
            while (diff > 0) {
                headB = headB.next;
                diff--;
            }
        }

        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }

        return headA;
    }
}