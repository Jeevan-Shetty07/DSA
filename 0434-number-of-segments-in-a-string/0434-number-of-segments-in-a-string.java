class Solution {
    public int countSegments(String s) {
        if(s.length()==0){
            return 0;
        }
        String[] words=s.split(" ");
        int count=0;
        for(String word:words){
                if( word.trim()!=""){
                    count++;
                }
        }
        return count;
    }
}