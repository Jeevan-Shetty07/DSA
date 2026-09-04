class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] maxsum = new int[n];
        int[] minsum = new int[n];
        maxsum[0] = nums[0];
        minsum[n-1] = nums[n-1];
        for (int i = 1; i < n; i++) {
              maxsum[i]=Math.max(maxsum[i-1],nums[i]);
            //   System.out.print(maxsum[i]);
            
        }
        for(int i=n-2;i>=0;i--){
              minsum[i]=Math.min(nums[i],minsum[i+1]);
                // System.out.println(maxsum[i]);
        }
        
        for(int i=0;i<nums.length;i++){
              if(maxsum[i]-minsum[i]<=k ){
                return i;
              }
        }
        return -1;
    }
}