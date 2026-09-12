class Solution {
    public int countSpecialIntegers(int[] nums) {
        

        int ans = 0;

        for (int i = 0; i < 101; i++) {

            int count = 0;
            int first = -1, second = -1, third = -1;

            for (int j = 0; j < nums.length; j++) {

                if (nums[j] == i) {
                    count++;

                    if (count == 1)
                        first = j;
                    else if (count == 2)
                        second = j;
                    else if (count == 3)
                        third = j;
                }
            }

            if (count == 3 && second - first == third - second)
                ans++;
        }

        return ans;
    }
}