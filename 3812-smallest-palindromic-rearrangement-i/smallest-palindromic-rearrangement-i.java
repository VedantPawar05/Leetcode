import java.util.HashMap;

class Solution {
    public String smallestPalindrome(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        StringBuilder left = new StringBuilder();
        StringBuilder middle = new StringBuilder();

        for (char ch = 'a'; ch <= 'z'; ch++) {

            if (map.containsKey(ch)) {

                int freq = map.get(ch);

                for (int i = 0; i < freq / 2; i++) {
                    left.append(ch);
                }

                if (freq % 2 != 0) {
                    middle.append(ch);
                }
            }
        }

        StringBuilder right = new StringBuilder(left);
        right.reverse();

        return left.toString() + middle.toString() + right.toString();
    }
}