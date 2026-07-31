class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        // Arrays.fill(freq, 0);
        for (char c : word.toCharArray()) {

            freq[c - 'a']++;
        }
        Arrays.sort(freq);
        int count = 0, num = 0;

        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0) {
                return count;
            }
            count += freq[i] * (num / 8 + 1);
            num++;

        }
        return count;
    }
}