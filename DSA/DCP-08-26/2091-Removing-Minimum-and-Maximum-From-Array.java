class Solution {
    public int minimumDeletions(int[] nums) {
        int max = Integer.MIN_VALUE, maxi = -1, mini = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                maxi = i;
            }
            if (nums[i] < min) {
                min = nums[i];
                mini = i;
            }
        }
        int len = nums.length;
        int f = 0, l = 0, b = 0;
        f = Math.max(maxi, mini) + 1;
        l = len - Math.min(maxi, mini);
        b = (Math.min(maxi, mini) + 1) + (len - Math.max(mini, maxi));
       return Math.min(Math.min(f,l),b);

    }
}