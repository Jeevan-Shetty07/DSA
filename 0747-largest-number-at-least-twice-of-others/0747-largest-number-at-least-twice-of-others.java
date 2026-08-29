class Solution {
    public int dominantIndex(int[] nums) {
        int ind=-1,high=0,shigh=0;
        for(int i=0;i<nums.length;i++){
            if(high<=nums[i]){
                ind=i;
                shigh=high;
                high=nums[i];
            }else if(shigh<=nums[i]){
                shigh=nums[i];
            }
        }
        System.out.println(high+""+shigh);
        return (shigh*2)<=high?ind:-1;
    }
}