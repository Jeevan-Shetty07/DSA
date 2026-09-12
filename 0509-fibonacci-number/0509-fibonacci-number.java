class Solution {
    public int fib(int n) {
        if(n<=1)
        return n;
       if(n<=2){
        return n-1;
       }
       int a=0,b=1;
       int sum=1;
       for(int i=3;i<=n;i++){
       
         int temp=a;
       
         a=b;
         b=temp+a;
         sum=a+b;

       }
       return sum;
    }
}