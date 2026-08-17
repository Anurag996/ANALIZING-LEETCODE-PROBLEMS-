class Solution {
    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0;
        int j = 0;
        int ans = 0;

        while (i < g.length && j < s.length) {

            // agar cookie bachche ki greed ko satisfy kar sakti hai
            if (s[j] >= g[i]) {
                ans++;
                i++;
                j++;
            } else {
                // cookie chhoti hai, next cookie check karo
                j++;
            }
        }

        return ans;
    }
}