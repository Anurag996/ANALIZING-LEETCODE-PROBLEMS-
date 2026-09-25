class Solution {
    public int numRescueBoats(int[] people, int limit) {
        
       int l=0;
       int r=people.length-1;
       int count=0;
       Arrays.sort(people);
       while(l<=r){

   int sum = people[l]+people[r];

    if(l==r){
            count++;
            return count;
        }

   if( sum == limit){
    count++;
    r--;
    l++;
   }
       
   else if(sum>limit){
    r--;
    count++;
   }
   else{
    count++;
    l++;
    r--;
   }
   }

   return count;
       }
    
    }
