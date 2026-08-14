class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        int start=0,end=0,max=0;
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
            end++;
            while(freq[s.charAt(i)-'a']>2){
                freq[s.charAt(start)-'a']--;
                start++;
            }
            max=Math.max(end-start,max);
        }
        return max;
    }
}