class Solution {
    public boolean isNumber(String s) {

        s = s.trim(); // extra spaces hata diye

        boolean numberMilGaya = false; // kya koi digit mila?
        boolean dotUseHua = false;     // kya '.' already use ho chuka?
        boolean eUseHua = false;       // kya 'e' already use ho chuka?

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

      // agar digit hai (0-9)
            if (Character.isDigit(c)) {
                numberMilGaya = true; // number mil gaya
            }

     // agar dot hai
            else if (c == '.') {
                // dot ek hi baar allowed hai aur 'e' ke baad nahi
                if (dotUseHua || eUseHua) {
                    return false;
                }
                dotUseHua = true;
            }

     // agar 'e' ya 'E' hai
            else if (c == 'e' || c == 'E') {
           // 'e' ek hi baar aur uske pehle number hona chahiye
                if (eUseHua || !numberMilGaya) {
                    return false;
                }
                eUseHua = true;

  // 'e' ke baad bhi number hona zaroori hai
                numberMilGaya = false;
            }

     // agar '+' ya '-' hai
            else if (c == '+' || c == '-') {
         // sirf start me ya 'e' ke baad allowed hai
                if (i != 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            }

    // koi aur character → invalid
            else {
                return false;
            }
        }

 // last me check: number hona hi chahiye
        return numberMilGaya;
    }
}