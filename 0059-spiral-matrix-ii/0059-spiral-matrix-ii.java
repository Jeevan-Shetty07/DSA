class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat=new int[n][n];
        int colstart=0;
        int colend=n-1;
        int rowstart=0;
        int rowend=n-1;
        int count=1;
        while(count<=(n*n)){
             for(int i=colstart;i<=colend;i++){
                mat[rowstart][i]=count++;
             }
             rowstart++;
             for(int i=rowstart;i<=rowend;i++){
                mat[i][colend]=count++;
             }
             colend--;
             for(int i=colend;i>=colstart;i--){
                mat[rowend][i]=count++;
             }
             rowend--;
             for(int i=rowend;i>=rowstart;i--){
                mat[i][colstart]=count++;
             }
             colstart++;
        }
        return mat;
 
    }
}