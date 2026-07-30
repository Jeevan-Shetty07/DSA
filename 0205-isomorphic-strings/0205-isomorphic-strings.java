class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hm = new HashMap<>();
        int i = 0;
        for (char ch : s.toCharArray()) {
            if (hm.containsKey(ch) && hm.get(ch) != t.charAt(i)) {
                return false;
            } else if (!hm.containsKey(ch) && hm.containsValue(t.charAt(i))) {
                return false;

            } else {
                hm.put(ch, t.charAt(i));
                i++;
            }
        }
        return true;
    }
}