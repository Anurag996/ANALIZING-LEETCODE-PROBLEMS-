class Solution {
    public String reverseWords(String s) {

        // extra spaces remove + words split
        String[] words = s.trim().split("\\s+");

        String result = "";

        // reverse loop
        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i];

            if (i != 0) {
                        result = result + " ";
            }
        }

        return result;
    }
}