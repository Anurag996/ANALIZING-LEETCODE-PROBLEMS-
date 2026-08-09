class Solution {
    public int jump(int[] nums) {
        
        int jump =0;
        int maxjaskteho=0;
        int current=0;

        for(int i=0 ;i<nums.length-1;i++){
            maxjaskteho= Math.max(maxjaskteho,i+nums[i]);

        if( i == current ){
           jump++;
            current=maxjaskteho;
        }
        }          
  return jump;
    }
}