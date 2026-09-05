class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] minpref=new int[n];
        int[] maxpref=new int[n];
        maxpref[0]=nums[0];
        minpref[n-1]=nums[n-1];
        for(int i=1;i<n;i++){
            maxpref[i]=Math.max(nums[i],maxpref[i-1]);
        }
         for(int i=n-2;i>=0;i--){
            minpref[i]=Math.min(nums[i],minpref[i+1]);
        }
        for(int i=0;i<n;i++){
            if(maxpref[i]-minpref[i]<=k)
            return i;
        }
        return -1;
    }
}