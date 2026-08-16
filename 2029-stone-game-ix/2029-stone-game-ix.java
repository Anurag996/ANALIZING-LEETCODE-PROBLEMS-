class Solution {
    public boolean stoneGameIX(int[] stones) {
        
        // 3 type ke stone count karne ke liye variable
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
        // simple for loop se pura array check karenge
        for (int i = 0; i < stones.length; i++) {
            
            // current stone ko 3 se divide karke remainder nikaal rahe hain
            int remainder = stones[i] % 3;
            
            // agar remainder 0 hai
            if (remainder == 0) {
                count0 = count0 + 1;
            }
            
            // agar remainder 1 hai
            else if (remainder == 1) {
                count1 = count1 + 1;
            }
            
            // agar remainder 2 hai
            else {
                count2 = count2 + 1;
            }
        }
        
        // ab winning condition check karenge
        
        // agar count0 even hai
        if (count0 % 2 == 0) {
            
            // dono type (1 aur 2) hone chahiye
            if (count1 > 0 && count2 > 0) {
                return true;
            } else {
                return false;
            }
        }
        
        // agar count0 odd hai
        else {
            
            // difference 2 se zyada hona chahiye
            if (Math.abs(count1 - count2) > 2) {
                return true;
            } else {
                return false;
            }
        }
    }
}