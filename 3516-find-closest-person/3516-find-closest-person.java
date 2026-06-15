class Solution {
    public int findClosest(int x, int y, int z) {
        int p1=x>z?(x-z):(z-x);
        int p2=y>z?(y-z):(z-y);
        if(p1==p2){
            return 0;
        }
          return p1>p2?2:1;
    }
}