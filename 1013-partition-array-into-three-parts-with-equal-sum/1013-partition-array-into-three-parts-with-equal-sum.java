class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int  sum=0;
        for(int num:arr){
            sum+=num;
        }
       
         int psum=sum/3,t=0,count=0;
        if(sum%3!=0){
            return false;
        }
        //  System.out.println(psum);
        for(int num:arr){
            t+=num;
            if(t==psum){
                count++;
                t=0;
            }
        }
        return count>=3;
    }
}