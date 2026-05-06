class Solution {
    public int maximumSum(int[] arr) {
        int n = arr.length;

        int noDel = arr[0];        // max sum without deletion
        int oneDel = 0;           // max sum with one deletion
        int ans = arr[0];

        for (int i = 1; i < n; i++) {
            oneDel = Math.max(noDel, oneDel + arr[i]);
            noDel = Math.max(arr[i], noDel + arr[i]);

            ans = Math.max(ans, Math.max(noDel, oneDel));
        }

        return ans;
    }
}