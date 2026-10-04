class Solution {
    public int numberOfChild(int n, int k) {
        int sec = 2 * (n - 1);
        int pos = k % sec;

        if (pos <= n - 1) {
            return pos;
        }

        return sec - pos;
    }
}