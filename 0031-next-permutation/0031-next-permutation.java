

class Solution {
    public void nextPermutation(int[] arr) {

        int n = arr.length;

        // Find p index
        int p = -1;

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                p = i;
                break;
            }
        }

        // If no p found, array is in descending order
        if (p == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        // Find q index
        int q = n - 1;

        for (int i = n - 1; i > p; i--) {
            if (arr[i] > arr[p]) {
                q = i;
                break;
            }
        }

        // Swap p and q
        int temp = arr[p];
        arr[p] = arr[q];
        arr[q] = temp;

        // Reverse the part after p
        reverse(arr, p + 1, n - 1);
    }

    public void reverse(int[] arr, int i, int j) {

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
}