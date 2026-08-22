class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n,prd=1,sum=0;
        while(temp>0){
               prd*=temp%10;
               sum+=temp%10;
               temp/=10;
        }
        return n%(prd+sum)==0;
    }
}