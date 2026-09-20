class Solution {
    public int reverseDegree(String s) {
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = s.charAt(i) - 'a' + 1;
            int reverse = 27 - value;

            ans += reverse * (i + 1);
        }

        return ans;
    }
}