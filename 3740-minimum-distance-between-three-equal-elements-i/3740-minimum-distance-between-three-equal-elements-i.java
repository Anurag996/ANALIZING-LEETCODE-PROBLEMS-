class Solution {
    public int minimumDistance(int[] nums) {

        if(nums.length<3) return -1;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    if( (i!=j) && (j!=k) && (k!=i) && (nums[i]==nums[j]) && (nums[j]==nums[k]) && (nums[j]==nums[k])){
                        int a = Math.abs(i-j);
                        int b = Math.abs(j-k);
                        int c = Math.abs(k-i);
                        int sum = a+b+c;
                        min = Math.min(min, sum);
                    }
                }
            }
        }
        if(min==Integer.MAX_VALUE)return -1;
        else return min;
    }
}