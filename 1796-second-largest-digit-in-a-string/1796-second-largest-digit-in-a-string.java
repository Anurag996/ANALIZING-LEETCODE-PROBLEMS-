
class Solution {
    public int secondHighest(String s) {

        int[] arr = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= '0' && ch <= '9') {
                arr[i] = ch - '0';
            } else {
                arr[i] = -1;
            }
        }

        return secondlargest(arr);
    }

    public int secondlargest(int[] arr) {

        int mx = -1;
        int smx = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > mx) {
                smx = mx;
                mx = arr[i];
            } else if (arr[i] > smx && arr[i] != mx) {
                smx = arr[i];
            }
        }

        return smx;
    }
}
