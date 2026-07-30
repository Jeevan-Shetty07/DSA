class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> hms = new HashMap<>();
        Map<Character, Character> hmt = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char chs=s.charAt(i), cht=t.charAt(i);
            if ((hms.containsKey(chs) && hms.get(chs) != cht)
                    || (hmt.containsKey(cht) && hmt.get(cht) !=chs)) {
                return false;
            } else {
                hms.put(chs , cht );
                hmt.put(cht , chs);

            }
        }
        return true;
    }
}