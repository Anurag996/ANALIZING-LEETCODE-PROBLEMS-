class Solution {
    public int trap(int[] height) {
        // int left = 0, right = height.length - 1;
        // int leftMax = 0, rightMax = 0;
        // int water = 0;

        // while (left < right) {
        //     if (height[left] < height[right]) {
        //         if (height[left] >= leftMax) {
        //             leftMax = height[left];
        //         } else {
        //             water += leftMax - height[left];
        //         }
        //         left++;
        //     } else {
        //         if (height[right] >= rightMax) {
        //             rightMax = height[right];
        //         } else {
        //             water += rightMax - height[right];
        //         }
        //         right--;
        //     }
        // }

        // return water;


// prefix
int sum=0;
    int n= height.length;
        int[] left = new int[n];
        left[0]=  height[0];
   for( int i=1;i< left.length;i++){
            left[i]= Math.max(left[i-1],height[i]);
   }
  //suffix

   int[] right = new int[n];
        right[n-1]=  height[n-1];
   for( int i=n-2;i>=0;i--){
            right[i]= Math.max(right[i+1],height[i]);
   }
      


      for(int i=0;i<n;i++){
        sum += (Math.min(left[i],right[i]))- height[i];
      }

      return sum ;
    }
}