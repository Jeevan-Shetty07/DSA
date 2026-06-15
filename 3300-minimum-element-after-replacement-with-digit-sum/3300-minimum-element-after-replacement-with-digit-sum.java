class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE,sum=0 ,pos=0;
        for (int i:nums) {
               sum=0;
               while(i>0){
                    sum+=i%10;
                    i=i/10;
               }
               nums[pos]=sum;
               min=Math.min(min,sum);

        }
        return min;
    }
}