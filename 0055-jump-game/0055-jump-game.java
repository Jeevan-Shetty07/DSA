class Solution {
    public boolean canJump(int[] nums) {
        // if(nums.length<=1){
        //     return true;
        // }
        int end=nums.length-1;
       for(int i=end-1;i>=0;i--){
            if(i+nums[i]>=end){
                end=i;
            }
            // System.out.println(end);
       }
     return end==0?true:false;
    }
}