class Solution {
    public int minAddToMakeValid(String s) {
        int open=0,close=0;
        int para=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                open++;
            }else if(ch==')'){
                if(open<=0){ 
                    open=0;
                   para++;
                }else{
                    open--;
                }
            }
        }
        return para+(open-close);
    }
}