
class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int total = 0;

        // Maximum subarray ke liye
        int currentMax = 0;
        int maxSum = nums[0];

        // Minimum subarray ke liye
        int currentMin = 0;
        int minSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            total = total + nums[i];

            // Kadane's Algorithm - Maximum
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSum = Math.max(maxSum, currentMax);

            // Kadane's Algorithm - Minimum
            currentMin = Math.min(nums[i], currentMin + nums[i]);
            minSum = Math.min(minSum, currentMin);
        }

        // Agar saare numbers negative hain
        if (maxSum < 0) {
            return maxSum;
        }

        // Circular subarray ka sum
        int circularSum = total - minSum;

        return Math.max(maxSum, circularSum);
    }
}