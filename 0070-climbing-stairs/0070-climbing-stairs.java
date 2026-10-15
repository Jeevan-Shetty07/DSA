class Solution {
    int   diffw(int n,int[] dp){
   if(n==0){
    return 1;
   }
   if(n==1){
    return 1;
   }
   if(dp[n-1]!=0){
    return dp[n-1];
   }
   return dp[n-1]=diffw(n-1,dp)+diffw(n-2,dp);
  
   
    }
    public int climbStairs(int n) {
        int[] dp=new int[n];
      return  diffw(n,dp);
    }
}