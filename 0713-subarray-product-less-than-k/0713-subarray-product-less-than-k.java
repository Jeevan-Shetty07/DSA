class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product=1,count=0,start=0;
        if(nums.length<2)
         return nums[0]<k?1:0;
        for(int i=0;i<nums.length;i++){
            product*=nums[i];
            while(product>=k){
               product=product/nums[start];
               start++; 
            }
        count+=i-start+1;
        }

        return count;
        
    }
}