class Solution {
    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> arr = new ArrayList<>();

        ListNode curr = head;
        while (curr != null) {
            arr.add(curr.val);
            curr = curr.next;
        }

        Stack<Integer> st = new Stack<>();
        int[] ans = new int[arr.size()];

        for (int i = arr.size() - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= arr.get(i)) {
                st.pop();
            }

            if (st.isEmpty()) {
                ans[i] = 0;
            } else {
                ans[i] = st.peek();
            }

            st.push(arr.get(i));
        }

        return ans;
    }
}