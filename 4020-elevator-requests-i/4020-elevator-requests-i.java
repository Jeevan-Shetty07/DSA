class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int sec=0;
        int curr=0;
        for(int req:requests){
            sec+=Math.abs(curr-req);
            curr=req;
        }
        return sec;
    }
}