class Solution {
    public boolean checkDivisibility(int n) {
        
        int num=n;
        int num1=n;
        int sum =0;
        int pro =1;
        while(num>0){
            sum=sum+num%10;
            pro=pro*(num1%10);
            num=num/10;
            num1=num1/10;
        }
        if(n%(pro+sum)== 0){
            return true;
        }
     return false;
     }
}