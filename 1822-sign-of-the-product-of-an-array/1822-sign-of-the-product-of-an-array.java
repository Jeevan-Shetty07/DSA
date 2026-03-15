class Solution {
    public int signFunc(double x){
        if(x>0){
            return 1;
        }else if(x<0){
            return -1;
        }else{
            return 0;
        }
    }
    public int arraySign(int[] nums) {
      int neg=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                return signFunc(0);
            }else if(nums[i]<0){
               neg=-neg;
            }
            
        }
         return signFunc(neg);
        
    }
}