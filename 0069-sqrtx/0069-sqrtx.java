class Solution {
    public int mySqrt(int x) {
        int prev=0;
         if(x==0){
            return 0;
         }else if(x<=3){
            return 1;
         }
         for(long i=2;i<=(x/2)+1;i++){
            if(i*i==x){
                return (int)i;
            }
            if(i*i>x){
                return prev;
            }
            prev=(int)i;
         }
         return 0;
    }
}