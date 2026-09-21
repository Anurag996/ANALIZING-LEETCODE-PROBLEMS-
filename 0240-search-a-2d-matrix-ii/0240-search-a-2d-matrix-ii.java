class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        


///   STAIRCASE ALGORITHM USE HUAH HAI 

    int row=0;
    int col= matrix[0].length-1;    /// YAHAN SE START KRO 

    while(row < matrix.length && col>=0){  /// YE LINE IMP HAI 
        if(matrix[row][col]==target){
            return true;
        }else if(matrix[row][col]>target){
                col--;
            }else{
                row++;
            }
    }
    

   
   return false;
    }
}