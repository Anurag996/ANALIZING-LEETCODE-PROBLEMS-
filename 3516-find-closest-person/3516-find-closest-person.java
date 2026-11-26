class Solution {
    public int findClosest(int x, int y, int z) {
        int diff = 0;
        if(Math.abs(z-x) > Math.abs(z-y)){
            return 2 ;
        }else if(Math.abs(z-x) == Math.abs(z-y)){
            return 0 ;
        }
        return 1;
    }
}