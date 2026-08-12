class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increase= true ;
        boolean decrese= true ;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                increase =false;
            
            }
            if(nums[i]<nums[i-1]){
                decrese = false ;
            
            }
        }
        return increase ||decrese   ;
    }
}