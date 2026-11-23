
class Solution {
    public int[] nextGreaterElements(int[] arr) {

        int n = arr.length;

        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < 2*n; i++) {

            while (!st.isEmpty() && arr[i % n] > arr[st.peek()]) {
                ans[st.pop()] = arr[i % n];
            }

            if(i < n) {
                st.push(i);
            }
        }

        while (!st.isEmpty()) {
            ans[st.pop()] = -1;
        }

        return ans;
    }
}
