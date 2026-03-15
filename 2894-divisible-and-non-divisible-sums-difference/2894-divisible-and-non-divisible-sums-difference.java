class Solution {
    public int differenceOfSums(int n, int m) {
        // int div=0,ndiv=0;
        int  k=n/m;
         int totn=(n*(n+1))/2;
         int div=(m*k*(k+1))/2;
         int ndiv=totn-div;

        return ndiv-div;
    }
}