class Solution {
    public int maximumProduct(int[] nums) {
        int max=-1001,smax=-1001,tmax=-1001,min=10001,smin=1001;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                tmax=smax;
                smax=max;
                max=nums[i];
            }else if(nums[i]>=smax){
                tmax=smax;
                smax=nums[i];
            }else if(nums[i]>=tmax){
                tmax=nums[i];
            }

             if(nums[i]<=min){
                smin=min;
                min=nums[i];
             }else if(nums[i]<=smin){
                smin=nums[i];
             }
        }
        // System.out.println(min+ " "+smin+" "+max+" "+" "+smax+" "+tmax);
       return Math.max(min*smin*max ,max*smax*tmax);
    }
}