import java.util.Arrays;

class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans;

        Arrays.sort(nums);

        ans = (nums[n - 1] - 1) * (nums[n - 2] - 1);

        return ans;
    }
}