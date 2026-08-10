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
            char ch=s.charAt(pos);
             lpos =(int) hm.get(ch);
            pos++;
            while (pos <= lpos) {
                if (hm.get(ch) > lpos) {
                    lpos = hm.get(ch);
                }
                 ch=s.charAt(pos);
                pos++;
               
            }
            al.add(pos -prev);
            prev=pos;
            count++;

        }
        return al;

    }
}