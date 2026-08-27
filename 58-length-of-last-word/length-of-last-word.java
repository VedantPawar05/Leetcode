class Solution {
    public int lengthOfLastWord(String s) {
        
        int count = 0;
        int i = s.length() - 1;

        for (; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                break;
            }
        }

        for (; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                break;
            }
            count++;
        }

        return count;
    }
}