class Solution {
    public int search(int[] nums, int target) {
        
        // int start = 0;
        // int end = arr.length - 1;
        
        // // binary search with rotation logic
        // while (start <= end) {
            
        //     int middle = start + (end - start) / 2;
            
        //     // agar middle pe hi target mil gaya
        //     if (arr[middle] == target) {
        //         return middle;
        //     }
            
        //     // check karo left wala part sorted hai
        //     if (arr[start] <= arr[middle]) {
                
        //         // agar target is sorted part ke andar hai
        //         if (target >= arr[start] && target < arr[middle]) {
        //             end = middle - 1;   // left side search karo
        //         } else {
        //             start = middle + 1; // right side jao
        //         }
        //     } 
        //     else {
        //         // warna right part sorted hai
                
        //         // check karo target right part me hai kya
        //         if (target > arr[middle] && target <= arr[end]) {
        //             start = middle + 1; // right side search
        //         } else {
        //             end = middle - 1;   // left side search
        //         }
        //     }
        // }
        
        // // agar target nahi mila
        // return -1;


  int si=0;
  int ei=nums.length-1;

    while(si<=ei){
        int mid = si + (ei-si)/2;

        if(nums[mid]==target){
            return mid;
        }

        if(nums[si]<= nums[mid]){ // left wali sort haii
           
         if(nums[si]<= target && target <= nums[mid]){
            ei=mid-1;
         }
         else{
            si=mid+1;
         }
        }

            else{ // right wali sort hai 
             if(nums[mid]<= target && target<= nums[ei]){
                si=mid+1;
             }else{
                ei= mid-1;
             }
            }
        }
    
    



  return -1;

     }
}
