class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length-1;

        if(nums[0]==nums[1])return nums[0];
        else if(nums[n]==nums[n-1])return nums[n];
    
        for(int i=1; i<n; i++){
            if((nums[i]==nums[i-1]) || (nums[i]==nums[i+1]))return nums[i];
        }

        return -1;

    }
}