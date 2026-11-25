class Solution { //2390
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
         Stack<Character> st2 = new Stack<>();
        for(int i=0; i<s.length();i++){
              char ch1 = s.charAt(i);
               if(ch1 == '#'){
                if(!st1.isEmpty()){
                    st1.pop() ;
                }
               }
                else{
                    st1.push(ch1); 
                }
               
        }
            for(int j=0; j<t.length();j++){
                char ch2 = t.charAt(j);
                  if(ch2 == '#'){
                    if(!st2.isEmpty()){
                    st2.pop() ;
                }
                  }
                else{
                    st2.push(ch2); 
                }
                  
            }
        
           if(st1.equals(st2)){
               return true ;
           }
        return false ;
    }
}