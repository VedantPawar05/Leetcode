class Solution {
    public int[] validSequence(String word1, String word2) {

        int n = word1.length();
        int m = word2.length();

        int[] right = new int[n + 1];
        int j = m - 1;

        for (int i = n - 1; i >= 0; i--) {
            right[i] = right[i + 1];

            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                right[i]++;
                j--;
            }
        }

        int[] ans = new int[m];

        int k = 0;
        boolean changed = false;

        for (int i = 0; i < n && k < m; i++) {

            if (word1.charAt(i) == word2.charAt(k)) {
                ans[k] = i;
                k++;
            } 
            else if (!changed) {
                int need = m - k - 1;

                if (right[i + 1] >= need) {
                    ans[k] = i;
                    k++;
                    changed = true;
                }
            }
        }

        return k == m ? ans : new int[0];
    }
}