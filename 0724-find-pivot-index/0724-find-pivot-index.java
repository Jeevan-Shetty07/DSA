class Solution {
    public int pivotIndex(int[] nums) {
        int rsum=0;
        for(int num:nums){
            rsum+=num;
        }
        int leftsum=0;
   if(rsum-nums[0]==0){
    return 0;
   }
     for(int i=1;i<nums.length;i++){
           leftsum+=nums[i-1];
            if(leftsum==rsum-leftsum-nums[i]){
                return i;
            }
           }
         return -1;
    }
}