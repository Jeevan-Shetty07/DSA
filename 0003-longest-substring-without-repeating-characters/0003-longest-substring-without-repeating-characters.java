class Solution {
    public int lengthOfLongestSubstring(String s) {
        
      Set<Character> uq=new HashSet<>();
      int start=0,max=0;
      for(int i=0;i<s.length();i++){
        while(uq.contains(s.charAt(i))){
            uq.remove(s.charAt(start));
            start++;
        }
          uq.add(s.charAt(i));
         max=Math.max(i-start+1,max);
      
      }
      return max;
    }
}