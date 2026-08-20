class Solution {
    public int pivotIndex(int[] nums) {
        

        //prefix 
int n = nums.length;
      
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

         // calculate
        for(int i = 0; i < n; i++) {

            int leftSum = 0;
            int rightSum = 0;

            if(i > 0) {
                leftSum = left[i - 1];
            }

            if(i < n - 1) {
                rightSum = right[i + 1];
            }

            if(leftSum == rightSum) {
                return i;
            }
        }

        return -1;

    }
}