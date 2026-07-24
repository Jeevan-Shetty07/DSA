class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double avg=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        avg=sum/(float)k;
        for(int i=1;i<nums.length-k+1;i++){
            sum-=nums[i-1];
            sum+=nums[i+k-1];
            avg=Math.max(avg,sum/(float)k);
        }
        return avg;
    }
}