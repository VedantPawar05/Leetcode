class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] ans = {-1, -1};

        ListNode prev = head;
        ListNode curr = head.next;

        int first = -1, last = -1;
        int min = -1;
        int index = 1;

        while (curr != null && curr.next != null) {

            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {

                if (first == -1) {
                    first = index;
                } else {
                    int d = index - last;
                    min = min == -1 ? d : Math.min(min, d);
                }

                last = index;
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        if (min != -1) {
            ans[0] = min;
            ans[1] = last - first;
        }

        return ans;
    }
}