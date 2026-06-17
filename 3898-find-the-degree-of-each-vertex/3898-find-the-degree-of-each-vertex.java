class Solution {
    public int[] findDegrees(int[][] matrix) {
        int deg;
        int mlen=matrix.length;
        int[] res=new int[mlen];
        int resc=0;
        for(int i=0;i<mlen;i++){
            deg=0;
            for(int j=0;j<mlen;j++){
                 res[j]+=matrix[j][i];
            }
           
        }
        return res;
    }
}