class Solution {
    public int majorityElement(int[] nums) {

        int vote = 0;        // count ki jagah vote
        int leader = 0;      // candidate ki jagah leader

       // for (int number : nums) {
  for(int i=0;i<nums.length;i++){
            // Agar vote 0 ho gaya, naya leader banao
            if (vote == 0) {
                leader = nums[i];
            }

            // Agar current number leader ke barabar hai
            if (nums[i] == leader) {
                vote++;     // support badhao
            } else {
                vote--;     // support ghatao
            }
      //  }
        }

        return leader; // final leader hi majority element hoga
    }
}
