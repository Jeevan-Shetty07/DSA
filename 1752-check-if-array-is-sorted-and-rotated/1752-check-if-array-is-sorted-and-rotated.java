class Solution {
    public boolean check(int[] nums) {
        int incc = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {

            } else {
                incc++;
            }
        }
       
        return (incc==1 && nums[nums.length-1]<=nums[0]) || incc==0;

    }
}