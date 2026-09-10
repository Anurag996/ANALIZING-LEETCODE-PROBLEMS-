class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        
         int si=0;
         int ei=0;
         int pro=1;
         int ans=0;

         while(ei<nums.length){
            // window grow

            pro = pro* nums[ei];

            // window shrink

            while(pro>=k && si<=ei){
                pro =pro/nums[si];
                si++;
            }
            //ans calc

            ans= ans+(ei-si+1);
            ei++;
         }




   return ans ;
    }
}