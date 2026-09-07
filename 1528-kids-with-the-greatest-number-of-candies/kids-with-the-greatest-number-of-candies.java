class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;

        int goat = 0;

        
        for (int i = 0; i < n; i++) {
            if (candies[i] > goat) {
                goat = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();

  
        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= goat) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}