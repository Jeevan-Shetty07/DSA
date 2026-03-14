class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=1;
        int loc=0;
        for(int i=0;i<sentences.length;i++){
            String curr=sentences[i];
             loc=1;
            for(int j=0;j<curr.length();j++){
            
                if(curr.charAt(j)==' '){
                   loc++;
                }
                
            }
            if(loc>max){
                    max=loc;
             }
        }
        return max;
    }
}