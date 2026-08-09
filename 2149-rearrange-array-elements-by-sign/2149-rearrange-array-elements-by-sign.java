class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int res[]=new int[n];
        int first=0,last=1;
        for(int num:nums){
            if(num>0){
                res[first]=num;
                first=first+2;
            }else{
                res[last]=num;
                last=last+2;
            }
        }
        return res;
    }
}