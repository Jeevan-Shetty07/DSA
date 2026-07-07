class Solution {
    public long sumAndMultiply(int n) {
        String s= String.valueOf(n);
        if(n==0){
            return 0;
        }

        StringBuilder res=new StringBuilder();
        long sum=0;

        for(char c:s.toCharArray()){
            if(c=='0'){
                continue;
            }
            sum=sum+(int)(c-'0');
            res.append(c);

        }
        
        return Long.parseLong(res.toString())*sum;
    }

}