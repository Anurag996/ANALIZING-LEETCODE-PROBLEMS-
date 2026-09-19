class Solution {
    public int findMiddleIndex(int[] nums) {
        
    int n = nums.length;

  
    int[] left = new int[n];
    int[] right = new int[n];
  // prefix
      
      left[0]=nums[0];
    for (int i=1;i<n;i++){
            left[i]=left[i-1]+nums[i];
   }
      //suffix
      right[n-1]=nums[n-1];
       for (int i=n-2;i>=0;i--){
            right[i]=right[i+1]+nums[i];
   }
        
// ans calc
        for(int i =0;i<n;i++){
    int leftsum=0;
    int rightsum=0;

            if(i>0){
     leftsum=left[i-1];
            }
             if(i<n-1){
                rightsum=right[i+1];
            }

            if(leftsum==rightsum){
                return i;
            }
        }
   
   return -1;
    }
}