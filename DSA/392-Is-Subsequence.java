class Solution {
    public boolean isSubsequence(String s, String t) {
        int sl=s.length(),sc=0,tc=0;
        int tl=t.length();
        while(sc<sl &&  tc<tl){
            if(s.charAt(sc)==t.charAt(tc)){
               sc++;       
            }
            tc++;
        }
        // System.out.println(tl+" "+sl);
        return sc==sl;
    }
}