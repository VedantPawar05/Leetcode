class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] seen = new int[128];
        int left = 0, maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            if (seen[s.charAt(i)] > 0) {
                left = Math.max(left, seen[s.charAt(i)]);
            }
            seen[s.charAt(i)] = i + 1;
            maxLen = Math.max(maxLen, i - left + 1);
        }

        return maxLen;
    }
}