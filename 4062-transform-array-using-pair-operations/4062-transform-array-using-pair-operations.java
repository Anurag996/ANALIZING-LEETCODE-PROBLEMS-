class Solution {
    public boolean canTransform(int[] source, int[] target) {

  long  sum=0;
        long sum1=0;
        for(int i=0;i<source.length;i++){
            sum=sum+source[i];
        } for(int i=0;i<target.length;i++){
            sum1=sum1+target[i];
        }if(sum==sum1){
            return true;
        }
    
    return false;
    }
}