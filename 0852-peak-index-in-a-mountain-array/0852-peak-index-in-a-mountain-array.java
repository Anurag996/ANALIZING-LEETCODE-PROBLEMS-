class Solution {
    public int peakIndexInMountainArray(int[] nums) {
        

  int si=1;
  int ei=nums.length-2;
  int ans=0;

   while(si<=ei){
    int  mid = si+ (ei-si)/2;

          if(nums[mid-1]< nums[mid] &&  nums[mid] >nums[mid+1]){
             ans=mid;
        return mid;
    }

          

           if(nums[mid-1]<nums[mid]){
                si=mid+1;
           }
           else{
            ei=mid-1;
           }
   }
    
    return ans;
    }
}
   