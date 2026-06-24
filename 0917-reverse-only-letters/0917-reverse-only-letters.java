class Solution {
    public String reverseOnlyLetters(String s) {
        int start = 0, last = s.length() - 1;
        char[] res=s.toCharArray();
        while (start < last) {
             while(!Character.isLetter(res[start]) && start<last){
                  start++;
             }
             while(!Character.isLetter(res[last]) && start<last){
                  last--;
             }
             char temp=res[start];
             res[start]=res[last];
             res[last]=temp;
             start++;
             last--;
        }
        return new String(res);
    }
}