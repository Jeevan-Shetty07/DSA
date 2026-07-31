class Solution {
    public int minimumPushes(String word) {
        Integer[] freq = new Integer[26];
        Arrays.fill(freq, 0);
        for (char c : word.toCharArray()) {

            freq[c - 'a']++;
        }
        Arrays.sort(freq, Collections.reverseOrder());
        int count = 0, pos = 1;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) {
                return count;
            }
            if (i % 8 == 0 && i!=0) {
                pos++;
            }
            count += freq[i] * pos;

        }
        return count;
    }
}