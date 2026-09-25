class Solution {

    public static boolean caneaten(int[] piles, int h, int mid) {

        long ans = 0;

        for (int i = 0; i < piles.length; i++) {

            ans = ans + (piles[i] + mid - 1) / mid;
        }

        return ans <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {

        int l = 1;
        int r = 0;
        int ans = -1;

        for (int i = 0; i < piles.length; i++) {
            r = Math.max(r, piles[i]);
        }

        while (l <= r) {

            int mid = l + (r - l) / 2;

            if (caneaten(piles, h, mid)) {

                ans = mid;
                r = mid - 1;

            } else {

                l = mid + 1;
            }
        }

        return ans;
    }
}