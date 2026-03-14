class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            int left=0,right=s.length()-1;
            boolean flag=true;
            while(left<right){
                if(s.charAt(left)!=s.charAt(right)){
                    flag=false;
                   break;
                }
                left++;
                right--;
            }
            if(flag){
                return s;
            }
            
        }
        return "";
    }
}