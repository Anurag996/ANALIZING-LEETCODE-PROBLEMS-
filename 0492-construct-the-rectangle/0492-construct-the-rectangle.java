class Solution {
    public int[] constructRectangle(int area) {

        // int[] arr = new int[2];

        // int minDiff = area;

        // for (int i = area; i >= 1; i--) {

        //     for (int j = 1; j <= area; j++) {

        //         if (i * j == area) {

        //             int diff = i - j;

        //             if (diff < minDiff) {
        //                 minDiff = diff;

        //                 arr[0] = i;
        //                 arr[1] = j;
        //             }
        //         }
        //     }
        // }

        // return arr;

        int[] arr = new int[2];

        for (int i = (int)Math.sqrt(area); i >= 1; i--) {

            if (area % i == 0) {

                arr[0] = area / i;
                arr[1] = i;

                return arr;
            }
        }

        return arr;
    }

}