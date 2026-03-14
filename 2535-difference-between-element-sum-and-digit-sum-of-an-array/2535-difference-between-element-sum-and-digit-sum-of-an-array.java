class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dig=0;
        for(int num:nums){
            sum+=num;
            int temp=num;
            while(temp>0){
                // int d=temp%10;
                dig=dig+(temp%10);
                temp=temp/10;
            }
        }
        return sum-dig;
    }
}