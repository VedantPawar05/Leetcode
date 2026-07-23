class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        Set<Integer> set = new HashSet<>();

        long currentSum = 0;
        long maxSum = 0;

        int left = 0;

        for (int right = 0; right < nums.length; right++) {

            while (set.contains(nums[right]) || set.size() == k) {
                set.remove(nums[left]);
                currentSum -= nums[left];
                left++;
            }

            currentSum += nums[right];
            set.add(nums[right]);

            if (set.size() == k) {
                maxSum = Math.max(maxSum, currentSum);
            }
        }

        return maxSum;
    }
}