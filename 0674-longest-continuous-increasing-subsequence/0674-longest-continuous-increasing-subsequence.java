class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int size=1,max=1;
        for(int i=1;i<nums.length;i++){
               if(nums[i]>nums[i-1]){
                size++;
               }else{
                size=1;
               }
               max=Math.max(max,size);
        }
        return max;
    }
}