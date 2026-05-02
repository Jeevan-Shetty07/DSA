class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int[26];
        for(char a:magazine.toCharArray()){
            freq[a-'a']=freq[a-'a']+1;
            }
        for(char a:ransomNote.toCharArray()){
            if(freq[a-'a']<1){
                return false;
            }else{
                freq[a-'a']--;
            }
        }
        return true;
        
    }
}