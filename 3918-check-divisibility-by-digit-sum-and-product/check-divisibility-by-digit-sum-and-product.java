class Solution {
    public boolean checkDivisibility(int n) {
        int original = n;
        int addition = 0;
        int multiplication = 1;

        while (n > 0) {
            int digit = n % 10;

            addition = addition+digit;
            multiplication = multiplication*digit;

            n = n / 10;
        }

        if (original % (addition + multiplication) == 0) {
            return true;
        } else {
            return false;
        }
    }
}