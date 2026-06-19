import java.util.HashMap;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character, Integer> frequency = new HashMap<>();

      
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char ch = ransomNote.charAt(i);

            if (!frequency.containsKey(ch) || frequency.get(ch) == 0) {
                return false;
            }

            frequency.put(ch, frequency.get(ch) - 1);
        }

        return true;
    }
}