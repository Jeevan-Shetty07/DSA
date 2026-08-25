class Solution {
    public int arrangeCoins(int n) {
        int step=0;
        for(int i=1;i<=n;i++){
          if(i>n){
            return step;
          }
          step++;
          n-=i;
        }
        return step;
    }
}