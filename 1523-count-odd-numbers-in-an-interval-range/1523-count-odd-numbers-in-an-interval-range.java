class Solution {
    public int countOdds(int low, int high) {
        int n = high + 1 - low;
        if (low % 2 != 0 && high % 2 != 0) {
            return (n / 2) + 1;
        }
        return n / 2;
    }
}