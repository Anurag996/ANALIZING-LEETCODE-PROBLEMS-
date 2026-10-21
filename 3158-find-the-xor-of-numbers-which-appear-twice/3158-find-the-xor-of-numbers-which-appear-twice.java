class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        int n =nums.length;
        int ans=0;
        int[] freq= new int[51];

        for(int i=0;i<n;i++){
            freq[nums[i]]++;
        }
        for(int i=0;i<51;i++){
            if(freq[i]==2){
                ans=ans^i;
            }
        }
    return ans;
    }
}