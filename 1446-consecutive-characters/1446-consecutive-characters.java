class Solution {
    public int maxPower(String s) {
        int conc=1,max=1;
        for(int i=1;i<s.length();i++){
           if(s.charAt(i)==s.charAt(i-1)){
            conc++;
           }else{
   
            conc=1;
           }
                    max=Math.max(max,conc);
           
        }
        return max;
    }
}