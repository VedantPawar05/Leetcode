class Solution {
    public int maxVowels(String s, int k) {
        int count = 0, max = 0;

        for (int i = 0; i < s.length(); i++) {
            
            if ("aeiou".indexOf(s.charAt(i)) != -1) count++;

            if (i >= k && "aeiou".indexOf(s.charAt(i - k)) != -1) count--;

            max = Math.max(max, count);
        }

        return max;
    }
}