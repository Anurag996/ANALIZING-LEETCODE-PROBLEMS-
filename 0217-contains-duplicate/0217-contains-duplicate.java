class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true; // duplicate found
            }
        }
        return false; // all unique
    }
}

//         int vote =0;
//         int leader=0;
//          for(int i=0;i<nums.length;i++){

//              vote=0;
//              leader=0;
//              if(vote==0){
//                 leader= nums[i]
//              }
//              if(nums[i]== leader){
//                 vote++;
//              }
//              else{
//                 vote--;
//              }
//          }

            
//     }
// }




// class Solution {
//     public boolean containsDuplicate(int[] nums) {
     
     //int count=0;
     
      // for(int i=0;i<nums.length-1;i++){
//             int ei=nums.length;
//             int si=0,count=0,count1=0;

//             while(si<ei){
//                 if(nums[si]!=nums[ei-1]){
//                     ei--;
//                     count++;
//                    // boolean flag=true;
//                 }if(si+count==nums.length-1){
//                     si++;
//                     count1++;
//                 }
//             }
               
//           if(count1==nums.length-1){
//         return true;
//        }
                   
      
   
//    return false;
//     }
// }
           
           