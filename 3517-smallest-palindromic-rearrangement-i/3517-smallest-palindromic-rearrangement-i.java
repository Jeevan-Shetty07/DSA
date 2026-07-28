class Solution {
    public String smallestPalindrome(String s) {
        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a'] +=1;
        }
        StringBuilder sb = new StringBuilder();
       int pos=0;
        for (int i = 0; i < 26; i++) {
            while(freq[i]>=2){
                 sb.insert(pos, (char) ('a' + i));
                 sb.insert(sb.length()-pos,(char) ('a' + i));
                 pos++;
                 freq[i]-=2;
            }
         if (freq[i] == 1) {
            //   System.out.println(sb);
               sb.insert(sb.length() / 2, (char) ('a' + i));
          }

        }
        return sb.toString();
    }
}