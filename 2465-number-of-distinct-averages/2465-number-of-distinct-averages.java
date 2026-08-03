class Solution {
    public int distinctAverages(int[] nums) {
        double[] arr = new double[nums.length/2];


        //if(nums.length==2)return 1;
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            double avg = (nums[i]+nums[j])/2.0;
            arr[i] = avg;
            i++;
            j--;
        }
        Arrays.sort(arr);
        //int num = nums[0];
        int count = 1;
        for(int k=1; k<arr.length; k++){
            if(arr[k]!=arr[k-1])count++;
        }
        return count;
    }
}