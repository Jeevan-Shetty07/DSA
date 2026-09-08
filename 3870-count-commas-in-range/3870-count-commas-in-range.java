class Solution {
    public int countCommas(int n) {
        if (n < 1000)
            return 0;
        if (n <= 999999)
            return n - 999;
        // int comma=9999-999;
        // if(n<=99999)
        return 0;
    }
}