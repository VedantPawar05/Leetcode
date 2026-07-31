
class Solution {
    public int minimumPushes(String word) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        ArrayList<Integer> freq = new ArrayList<>();

        for (int f : map.values()) {
            freq.add(f);
        }

        Collections.sort(freq, Collections.reverseOrder());

        int ans = 0;

        for (int i = 0; i < freq.size(); i++) {
            ans += freq.get(i) * (i / 8 + 1);
        }

        return ans;
    }
}