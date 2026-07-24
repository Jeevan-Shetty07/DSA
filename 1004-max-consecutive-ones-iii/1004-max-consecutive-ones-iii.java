class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0,flip=0,start=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                flip++;
            }
          while(flip>k){
               if(nums[start]==0){
                 flip--;
               }
               start++;
          }
          max=Math.max(max,i-start+1);
        }
        return max;
    }
}