class Solution {
    public int gcdOfOddEvenSums(int n) {
    
        int osum=n*(n),esum=n*(n+1);

        return esum-osum;
    }
}