class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[nums.length * 2];
        int len = ans.length-1 ;
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[len-i]=nums[i];
        }
        return ans;
    }
}