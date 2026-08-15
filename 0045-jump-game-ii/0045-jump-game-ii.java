class Solution {
    public int jump(int[] nums) {
        int start=0,end=0,count=0,length=nums.length,pos=0;
        while(end<length){
            int nend=end+1;
            while(start<=end){
                nend=Math.max(nend,nums[start]+start>=length?length-1:nums[start]+start);
                start++;
              
            }
            count++;
            end=nend;
        }
        return count-1;
    }
}