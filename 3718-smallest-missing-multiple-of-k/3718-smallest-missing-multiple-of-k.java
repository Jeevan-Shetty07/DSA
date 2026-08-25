class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);

        int n = 0;
        int multiple = k;

        while (n < nums.length) {

            while (n < nums.length && nums[n] < multiple) {
                n++;
            }

            if (n == nums.length || nums[n] != multiple) {
                return multiple;
            }

            multiple += k;
            n++;
        }

        return multiple;
    }
}