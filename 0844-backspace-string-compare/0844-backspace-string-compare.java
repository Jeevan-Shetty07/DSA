class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (sb.length() != 0)
                    sb.delete(sb.length() - 1, sb.length());
            } else {
                sb.append(ch);
            }
        }
        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (sb1.length() != 0)
                    sb1.delete(sb1.length() - 1, sb1.length());
            } else {
                sb1.append(ch);
            }
        }
        System.out.println(sb1+" "+sb);
        return sb.toString().equals(sb1.toString());
    }
}