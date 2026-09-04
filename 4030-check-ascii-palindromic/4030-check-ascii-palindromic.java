class Solution {
    public boolean isPalindromic(String s) {



        String  binary= "";

        // sbse phle to 8 bit bbinary me convert kr rhe hai 
        for(int i =0 ;i< s.length(); i++){
            int ascii = (int)s.charAt(i);

            String temp = Integer.toBinaryString(ascii);


            // bhai dekh ye leading zeroes add kr diye
            while(temp.length()<8){
                temp = "0" + temp;
            }
            binary = binary+ temp;
        }

        // ab palinndrome dekh rha hu 

        int left =0;
        int right = binary.length()-1;

        for(int i=0;i< right ;i++){
            if(binary.charAt(left) != binary.charAt(right)){
                return false;
            }
            right--;
            left++;
        }

        

       return true; 
    }
}