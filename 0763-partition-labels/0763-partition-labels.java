class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> hm = new HashMap<>();
        List<Integer> al = new ArrayList<>();
        int length=s.length();
        for (int i = 0; i < length; i++) {
            hm.put(s.charAt(i), i);
        }
        int lpos = 0, pos = 0, count = 0,prev=0;
        while (pos < length) {
             lpos =(int) hm.get(s.charAt(pos));
            pos++;
            while (pos <= lpos) {
                if (hm.get(s.charAt(pos)) > lpos) {
                    lpos = hm.get(s.charAt(pos));
                }
                pos++;
            }
            al.add(pos -prev);
            prev=pos;
            count++;

        }
        return al;

    }
}