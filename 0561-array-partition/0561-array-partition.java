class Solution {
    public int arrayPairSum(int[] nums) {
        int min =Integer.MAX_VALUE ;
        int sum =0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i=i+2){
                sum = sum + Math.min(nums[i],nums[i+1]);
               
            }

        return sum ;
    }
}