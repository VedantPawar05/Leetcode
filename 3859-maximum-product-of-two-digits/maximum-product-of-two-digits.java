import java.util.Arrays;

class Solution {
    public int maxProduct(int n) {
        String s = String.valueOf(n);
        int[] arr = new int[s.length()];

      
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) - '0';
        }
        Arrays.sort(arr);
        return arr[arr.length - 1] * arr[arr.length - 2];
    }
}