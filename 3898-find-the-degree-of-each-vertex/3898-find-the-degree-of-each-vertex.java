class Solution {
    public int[] findDegrees(int[][] matrix) {
        int deg;
        int[] res=new int[matrix.length];
        int resc=0;
        for(int i=0;i<matrix.length;i++){
            deg=0;
            for(int j=0;j<matrix.length;j++){
                if(matrix[j][i]==0){
                     continue;
                }
                deg++;
            }
            res[resc++]=deg;
        }
        return res;
    }
}