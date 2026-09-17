class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int n = arr.length;
        int[] best = new int[n];
        
        int INF = n + 1;
        int ans = INF;
        int minLen = INF;

        int i = 0;
        int sum = 0;

        for (int j = 0; j < n; j++) {
            sum += arr[j];

            while (sum > target) {
                sum -= arr[i];
                i++;
            }

            if (sum == target) {
                int len = j - i + 1;

                if (i > 0 && best[i - 1] != INF) {
                    ans = Math.min(ans, len + best[i - 1]);
                }

                minLen = Math.min(minLen, len);
            }

            best[j] = minLen;
        }

        return ans == INF ? -1 : ans;
    }
}