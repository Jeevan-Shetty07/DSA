class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char c=' ';
        int last=0;
        int max=0,pos=0;
        for(char ch:keysPressed.toCharArray()){
                 if(max<releaseTimes[pos]-last){
                    c=ch;
                    max=releaseTimes[pos]-last;
                 }else if(max==releaseTimes[pos]-last && ch>c){
                    c=ch;

                 }
                 last=releaseTimes[pos];
                 pos++;
        }
        return c;
        
    }
}