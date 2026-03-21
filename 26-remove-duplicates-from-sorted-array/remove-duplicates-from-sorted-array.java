class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0; // handle empty array

        int i = 0;                  // pointer to last unique element
        int j = 1;                  // scanning pointer
        int uniquecount = 1;        // first element is always unique
        int n = nums.length;

        while (j < n) {
            if (nums[i] == nums[j]) {
                j++;                // skip duplicate
            } else {
                i++;                
                nums[i] = nums[j];  // place the new unique element
                uniquecount++;      
                j++;
            }
        }

        return uniquecount;         // return total number of unique elements
    }
}