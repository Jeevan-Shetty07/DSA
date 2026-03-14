class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dig=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int temp=nums[i];
            while(temp>0){
                int d=temp%10;
                dig+=d;
                temp=temp/10;
            }
        }
        return sum-dig;
    }
}