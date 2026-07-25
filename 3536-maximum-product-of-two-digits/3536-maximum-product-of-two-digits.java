class Solution {
    public int maxProduct(int n) {
        int max=0,smax=0;
        while(n>0){
            int digit=n%10;
            if(digit>=max){
                smax=max;
                max=digit;
            }else if(digit>smax){
              smax=digit;
            }
            // System.out.println(max+" "+smax);
            n=n/10;
        }
        return max*smax;
    }
}