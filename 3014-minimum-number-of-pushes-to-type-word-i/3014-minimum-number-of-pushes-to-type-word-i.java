class Solution {
    public int minimumPushes(String word) {
        int mul=1;
        int count=0;
        for(int i=1;i<=word.length();i++){
               count=count+mul;
               if(i%8==0)
               mul++;
        }
        return count;
        
    }
}