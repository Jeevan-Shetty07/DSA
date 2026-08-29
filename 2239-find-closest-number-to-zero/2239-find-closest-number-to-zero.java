class Solution {
    public int findClosestNumber(int[] nums) {
        int nu = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(nu) ||
                (Math.abs(num) == Math.abs(nu) && num > nu)) {
                
                nu = num;
            }
        }

        return nu;
    }
}