class Solution {
    public int missingMultiple(int[] nums, int k) {
        int curr = k;

        while (true) {
            int count = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == curr) {
                    count++;
                }
            }

            if (count == 0) {
                return curr;
            }

            curr = curr + k;
        }
    }
}