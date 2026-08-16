class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        String ans[] = new String[names.length];

        for(int i=0;i< names.length;i++){

            int max=0;
            int index=0;

        for( int j =0;j<heights.length;j++){
                
                if(heights[j]>max){
                    max= heights[j];
                    index=j;
                }
            
        }
        ans[i]= names[index];
        heights[index]=0;
        }

return ans ;
    }
}