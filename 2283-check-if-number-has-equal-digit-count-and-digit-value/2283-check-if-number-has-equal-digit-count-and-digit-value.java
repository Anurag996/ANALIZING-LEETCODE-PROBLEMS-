
class Solution {
    public boolean digitCount(String num) {

        int[] arr = new int[10];

        // Har digit ki frequency count karenge
        for(int i = 0; i < num.length(); i++) {
            int digit = num.charAt(i) - '0';
            arr[digit]++;
        }

        // Har index ki frequency check karenge
        for(int i = 0; i < num.length(); i++) {

            int digit = num.charAt(i) - '0';

            if(arr[i] != digit) {
                return false;
            }
        }

        return true;
    }
}
