class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hms = new HashMap<>();
        Map<Character, Character> hmt = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if ((hms.containsKey(s.charAt(i)) && hms.get(s.charAt(i)) != t.charAt(i))
                    || (hmt.containsKey(t.charAt(i)) && hmt.get(t.charAt(i)) != s.charAt(i))) {
                return false;
            } else {
                hms.put(s.charAt(i), t.charAt(i));
                hmt.put(t.charAt(i), s.charAt(i));

            }
        }
        return true;
    }
}