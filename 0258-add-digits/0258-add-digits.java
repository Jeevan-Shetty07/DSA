class Solution {
    public int addDigits(int num) {
        int sum=(num-1)%9;
      
        return sum+1;
    }
}