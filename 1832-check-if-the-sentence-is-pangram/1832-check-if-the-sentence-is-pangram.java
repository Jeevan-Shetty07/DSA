class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alpha=new boolean[26];
        // if(sentence,length()<26){
        //     return false;
        // }
        for(char c:sentence.toCharArray()){
            alpha[c-'a']=true;
        }
       for(int i=0;i<26;i++){
        if(!alpha[i]){
            return false;
        }
       }
        return true;
    }
}