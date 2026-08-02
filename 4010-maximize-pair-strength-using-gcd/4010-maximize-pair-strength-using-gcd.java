class Solution {
    public long maxPairStrength(int[] nums) {
        
        long max = Integer.MIN_VALUE;

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
        
                long prod = (long)nums[i]*nums[j];
        
                long a = Math.max(nums[i], nums[j]);
                long b = Math.min(nums[i], nums[j]);
                while(b!=0){
                    long temp = b;
                    b = a%b;
                    a = temp;
                }
                long gcd = a*a;
                long pair = prod/gcd;
                max = Math.max(max, pair);
            }
        }
        return max;
    }
}