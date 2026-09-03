class Solution {
    public boolean uniformArray(int[] nums1) {

        int minOdd = Integer.MAX_VALUE;
        boolean even = false;
        boolean odd = false;

        // Find smallest odd and check parity
        for (int i = 0; i < nums1.length; i++) {

            if (nums1[i] % 2 == 0) {
                even = true;
            } else {
                odd = true;
                minOdd = Math.min(minOdd, nums1[i]);
            }
        }

        // All numbers have same parity
        if (!even || !odd) {
            return true;
        }

        // Try to make all numbers odd
        for (int i = 0; i < nums1.length; i++) {

            if (nums1[i] % 2 == 0) {

                if (nums1[i] <= minOdd) {
                    return false;
                }
            }
        }

        return true;
    }
}