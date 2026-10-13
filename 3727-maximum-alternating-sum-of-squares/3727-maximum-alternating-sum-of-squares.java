class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=-1*nums[i];
            }
        }
        Arrays.sort(nums);
        long sum=0;
        int neg=nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(i<neg){
                sum-=(nums[i]*nums[i]);
                // System.out.println(nums[i]);
            }else{
                 sum+=(nums[i]*nums[i]);
            }
        }
        return sum;

        
    }
}