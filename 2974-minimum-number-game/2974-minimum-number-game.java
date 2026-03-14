class Solution {
    public int[] numberGame(int[] nums) {
        int[] res=new int[nums.length];
        Arrays.sort(nums);
        int alice=0;
        int bob=0;
        int max=999;
        for (int i=0;i<nums.length;i+=2){
           alice=nums[i];
           bob=nums[i+1];
           res[i]=bob;
           res[i+1]=alice;
        }
        return res;
    }
}