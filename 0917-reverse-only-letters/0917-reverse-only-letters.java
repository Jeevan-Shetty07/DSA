class Solution {
    public String reverseOnlyLetters(String s) {
        int start = 0, last = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (start < last) {
            char f=s.charAt(start);
            char l=s.charAt(last);

            while(!Character.isLetter(f) && start < last) {
                start++;
                f=s.charAt(start);
               
            }
            while (!Character.isLetter(l) && last > start) {
                last--;
                l=s.charAt(last);
            }
            sb.replace(start, start + 1, String.valueOf(l));
            sb.replace(last, last + 1, String.valueOf(f));
            start++;
            last--;
        }
        return sb.toString();
    }
}