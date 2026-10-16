class Solution {
    public String reverseWords(String s) {
        int pos = 0;
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (pos < s.length() && s.charAt(pos) != ' ') {
            if (s.charAt(pos) == 'a' || s.charAt(pos) == 'e' || s.charAt(pos) == 'i' || s.charAt(pos) == 'o'
                    || s.charAt(pos) == 'u') {
                count++;
            }
            sb.append(s.charAt(pos));
            pos++;

        }
        if (pos == s.length()) {
            return sb.toString();
        }
        pos++;
        sb.append(' ');
        StringBuilder tsb = new StringBuilder();
        int vcount = 0;
        for (int i = pos; i <= s.length(); i++) {
            if (i == s.length() || s.charAt(i) == ' ') {
                if (vcount == count) {
                    sb.append(tsb.reverse());
                } else {
                    sb.append(tsb);
                }
                tsb.setLength(0);
                vcount = 0;

                if (i == s.length()) {
                    break;
                }
                sb.append(' ');
            } else {
                tsb.append(s.charAt(i));
            }
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                vcount++;
            }

        }
        return sb.toString();
    }
}