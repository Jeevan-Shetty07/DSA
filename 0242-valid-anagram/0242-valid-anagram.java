class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charfreq=new char[26];
        if(t.length()!=s.length()){
            return false;
        }
        for(char c : s.toCharArray()){
               charfreq[c-'a']++;
        }
        for(char c: t.toCharArray()){
            if(charfreq[c-'a']==0){
                return false;
            }
            charfreq[c-'a']--;
        }
          return true;
    }
}