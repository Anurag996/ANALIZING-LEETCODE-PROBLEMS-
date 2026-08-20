class Solution {
    public int[] leftRightDifference(int[] nums) {
        

        int n = nums.length;
        int[] ans= new int[n];
      
        int[] left =    new int[n];
        left[0]= nums[0];
        for(int i=1;i< left.length;i++){
            left[i] = left[i-1]+nums[i];
        }

        //suffix 
         int[] right =    new int[n];
        right[n-1]= nums[n-1];
        for(int i=n-2;i>=0;i--){
            right[i] = right[i+1]+nums[i];
        }


        // calculate

        for(int i=0;i< n;i++){
            ans[i]= Math.abs(left[i]-right[i]);
        }
return ans;
    }
}