class Solution {
    public boolean canAliceWin(int[] nums) {
        int sing=0,doub=0;
        for(int num:nums){
            if(num<10){
                sing+=num;
            }else{
                doub+=num;
            }
        }
    return sing!=doub;
    }
}