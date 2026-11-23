
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {

        // int[] ans = new int[temperatures.length];
        // int n = temperatures.length;

        // for(int i = 0; i < n-1; i++) {

        //     for(int j = i+1; j < n; j++) {

        //         if(temperatures[j] > temperatures[i]) {
        //             ans[i] = j-i;
        //             break;
        //         }
        //     }
        // }

        // return ans;

 int n = temperatures.length;

        int[] ans = new int[n];

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {

            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]) {

                int index = st.pop();

                ans[index] = i - index;
            }

            st.push(i);
        }

return ans ;

    }
}
