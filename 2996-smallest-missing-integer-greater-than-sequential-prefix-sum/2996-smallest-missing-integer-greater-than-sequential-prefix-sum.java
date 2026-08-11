class Solution {
    public int missingInteger(int[] nums) {
        if(nums.length==1){
            return nums[0]+1;
        }
        int prev = nums[0];
        boolean[] arr = new boolean[50];
        int sum = prev;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != prev + 1) {
                break;
            } else {
                sum += nums[i];
                prev = nums[i];
            }
        }
        if (sum > 50) {
            return sum;
        } else {
            for (int i : nums) {
                arr[i-1] = true;
            }
            while(sum<=50 && arr[sum-1] ){
                sum++;
            }

        }

        return sum;

    }
}