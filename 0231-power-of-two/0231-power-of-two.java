class Solution {
    // int count;
    public boolean rec(int n){
        if(n==1){
            return true;
        }else if(n<=0 || n%2!=0){
            return false;
        }else{
           return  rec(n/2);
        }
        // return true;
    }
    public boolean isPowerOfTwo(int n) {

        boolean flag=rec(n);
        return flag;
        
    }
}