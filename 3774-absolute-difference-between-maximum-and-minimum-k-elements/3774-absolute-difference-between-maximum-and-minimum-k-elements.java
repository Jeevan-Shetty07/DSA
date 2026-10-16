class Solution {
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int fsum=0;
        int lsum=0;
        for(int i=0;i<k;i++){
              fsum+=nums[i];
              lsum+=nums[nums.length-i-1];
        }
        return Math.abs(fsum-lsum);
    }
}