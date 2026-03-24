class Solution {
    // int count;
    public boolean rec(double num,int n){
        if(num>n){
            return false;
        }else if(num==n){
            return true;
        }else{
           return  rec(num*2,n);
        }
        // return true;
    }
    public boolean isPowerOfTwo(int n) {
        boolean flag=rec(1,n);
        return flag;
        
    }
}