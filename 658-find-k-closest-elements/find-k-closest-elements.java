import java.util.*;

class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0;
        int right = arr.length - 1;

        while (right - left + 1 > k) {
            int distance1 = Math.abs(arr[left] - x);
            int distance2 = Math.abs(arr[right] - x);

            if (distance1 > distance2) {
                left++;
            } else {
                right--;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            ans.add(arr[i]);
        }

        return ans;
    }
}
