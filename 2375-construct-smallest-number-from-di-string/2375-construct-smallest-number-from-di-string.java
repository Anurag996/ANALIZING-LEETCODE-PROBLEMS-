class Solution {
    public String smallestNumber(String pattern) {
        

        // i pe bharo 
        // agar 2 i mile jae aur unke beechme bhar skte ho to koi distinct bharo 
        //  agar length me pahuch jaoto ulta krke number bhar do taaki small no... ban jae 

          return(Construct_Smallest_Number(pattern));

    }

     public static String  Construct_Smallest_Number(String pattern){

        int [] ans = new int[pattern.length()+1];
        Stack<Integer> st = new Stack<>();
        int c=1;
        for(int i= 0; i<= pattern.length(); i++){
            if(i==pattern.length() ||  pattern.charAt(i) == 'I'){
                ans[i]= c++;
                while(!st.isEmpty()){
                    ans[st.pop()]= c++;
                }
            }else{
                st.push(i);
            }
        }
       String s= "";
        for(int x :ans){
            s += x;
        }
        return s;
    }
}