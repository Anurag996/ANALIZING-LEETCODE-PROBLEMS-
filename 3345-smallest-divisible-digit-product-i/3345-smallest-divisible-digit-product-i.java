class Solution {
    public int smallestNumber(int n, int t) {
      while(true){   
   int pro =1;
   int original=n;
   while(original>0){

      int rem = original%10;
      pro=pro*rem;
       original=original/10;

   }
   if(pro%t ==0){
    return n;
   }

  n++;
    }
    }
}