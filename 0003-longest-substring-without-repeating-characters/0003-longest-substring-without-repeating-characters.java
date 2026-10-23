class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int ans = 0;
        int[] freq = new int[128];

        int right = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);

            // Step 1: Grow
            freq[ch]++;

            // Step 2: Shrink
            while (freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            // Step 3: Update answer
            ans = Math.max(ans, right - left + 1);

            right++;
        }

        return ans;
    }
}