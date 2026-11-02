class Solution {
    public long minimumMaxValue(int n, int index, int value) {
        if(value==1){
            return -1;
        }


        int p= value;
        for(int i =2;i*i<= value ;i++){
            if(value%i==0){
                p=i;
                break;
            }
        }

        if(index>(value-p)/2)return -1;
        
        long ans= value;
       int steps= n- index-1;
        if(steps>0){
            if(value%2==0){
                ans=value+2L*steps;
            }
            else{
                ans= value+(long)p+ 2L*(steps-1);
            }
        }
        
        
    return ans;    
    }
}