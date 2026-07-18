class Solution {
    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }
    public int findGCD(int[] nums) {
        int min=9999,max=0;
        for(int num:nums){
             if(num>max){
                max=num;
             }if(num<min){
                min=num;
             }
        }
        return gcd(min,max);
        
    }
}