class Solution {
    public String longestCommonPrefix(String[] strs) {
       
        StringBuilder sub = new StringBuilder(strs[0]);
       
         for(int i=1;i<strs.length;i++){
            String word=strs[i];
            if(sub.length()==0  || word.length()==0){
                return "";
            }
            if(strs[i].length()<sub.length() || !word.startsWith(sub.toString())){
                   i=0;
                   sub.deleteCharAt(sub.length()-1);
            }   
         }
        return  sub.toString();
    }
}