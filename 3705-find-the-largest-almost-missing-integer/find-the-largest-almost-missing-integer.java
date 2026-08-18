class Solution {
    public int largestInteger(int[] nums, int k) {

        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        if (k == 1) {
            int ans = -1;

            for (int i = 0; i < n; i++) {
                if (map.get(nums[i]) == 1) {
                    ans = Math.max(ans, nums[i]);
                }
            }

            return ans;
        }
        if (k == n) {
            int ans = nums[0];

            for (int i = 1; i < n; i++) {
                ans = Math.max(ans, nums[i]);
            }

            return ans;
        }
        int ans = -1;

        if (map.get(nums[0]) == 1) {
            ans = Math.max(ans, nums[0]);
        }

        if (map.get(nums[n - 1]) == 1) {
            ans = Math.max(ans, nums[n - 1]);
        }

        return ans;
    }
}