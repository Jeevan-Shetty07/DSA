class Solution {
    public long coloredCells(int n) {
        if(n==1){
            if(n==0){
                return 0;
            }
            return n=1;
        }
         long sum=(4*((long)n-1)*((long)n))/2;
        return sum+1;
    }
}