class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
     int middle=nums[nums.length/2];
     nums[nums.length/2]=0;
    //   System.out.println(middle);
       for(int num:nums){
         if(middle==num)
         return false;
       }
        return true;
    }
}