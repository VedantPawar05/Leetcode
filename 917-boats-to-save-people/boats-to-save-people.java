class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int NumberOfBoats = 0;
        Arrays.sort(people);
        int i = 0, j = n - 1;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++;
                j--;
            } else {
                j--;
            }
            NumberOfBoats++;
        }

        return NumberOfBoats;
    }
}