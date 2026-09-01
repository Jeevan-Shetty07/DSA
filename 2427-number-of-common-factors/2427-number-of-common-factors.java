class Solution {
    public int commonFactors(int a, int b) {
        int num=0;
        int end=Math.min(a,b);
        for(int i=1;i<=end;i++){
            if(a%i==0 && b%i==0){
                num++;
            }
        }
        return num;
        
    }
}