import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);

        int n = nums.length;
        int i = 0, j = i + 1;
        int count = 0;

        while (j < n) {

            if (i == j) {
                j++;
                continue;
            }

            int diff = nums[j] - nums[i];

            if (diff == k) {
                count++;

                i++;
                j++;

               
                while (j < n && nums[j] == nums[j - 1]) {
                    j++;
                }

            } else if (diff < k) {
                j++;   
            } else {
                i++;  
            }
        }

        return count;
    }
}