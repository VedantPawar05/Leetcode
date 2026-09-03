class Solution {
    public boolean uniformArray(int[] nums1) {
        int smallest = nums1[0];

         for (int i = 1; i < nums1.length; i++) {
            if (nums1[i] < smallest) {
                smallest = nums1[i];
            }
        }


              if (smallest % 2 != 0) {
            return true;
            }
            for (int i = 0; i < nums1.length; i++) {
                        if (nums1[i] % 2 != 0) {
                            return false;
                        }
                    }

                    return true;
                }
        }