class Solution {
    public int smallestEqual(int[] nums) {


       for(int i=0;i< nums.length ;i++){
  int num = i%10;
        if(nums[i] == num ){
            return i;
        }
       }


return -1 ;
    }
}