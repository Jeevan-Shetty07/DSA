class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)
         return true;
        long num=1;
        while(true){
            num=num*4;
             if(num==n){
                return true;
             }else if(num>n){
                return false;
             }

        }
    }
}