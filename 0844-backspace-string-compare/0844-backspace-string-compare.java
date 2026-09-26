class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (sb.length() > 0)
                    sb.deleteCharAt(sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }

        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (sb1.length() > 0)
                    sb1.deleteCharAt(sb1.length() - 1);
            } else {
                sb1.append(ch);
            }
        }

        return sb.toString().equals(sb1.toString());
    }
}