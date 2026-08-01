class Solution {
    public int maximizeSum(int[] nums, int k) {
        
         int sum =0;
         Arrays.sort(nums);

         for ( int i=0 ;i<k;i++){
                sum =  sum +nums[nums.length -1 ]+(1*i);

         }

   return sum;
    }
}