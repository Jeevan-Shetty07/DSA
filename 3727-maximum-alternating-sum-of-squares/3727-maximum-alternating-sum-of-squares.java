class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
           
                nums[i]=(nums[i]*nums[i]);
           
        }
        Arrays.sort(nums);
        long sum=0;
        int neg=nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(i<neg){
                sum-=nums[i];
            }else{
                 sum+=nums[i];
            }
        }
        return sum;

        
    }
}