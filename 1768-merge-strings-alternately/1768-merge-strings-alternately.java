class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder ans = new StringBuilder("");
int i=0;
        for(;i<Math.min(word1.length(), word2.length());i++){
            char ch = word1.charAt(i);
            ans = ans.append(ch);
             char ch2 = word2.charAt(i);
               ans = ans.append(ch2);
        }
        while(i<word1.length()){
             char ch = word1.charAt(i);
            ans= ans.append(ch);
            i++;
        }
         while(i<word2.length()){
             char ch2 = word2.charAt(i);
            ans= ans.append(ch2);
            i++;
        }
    return ans.toString();
    }
}