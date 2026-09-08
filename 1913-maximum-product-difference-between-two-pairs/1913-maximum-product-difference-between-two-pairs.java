class Solution {
    public int maxProductDifference(int[] nums) {
        int max=-1,smax=-1,min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
        for(int num:nums){
            if(num>=max){
                smax=max;
                max=num;
            }else if(num>smax){
                smax=num;
            }
              if(num<=min){
                smin=min;
                min=num;
            }else if(num<smin){
                smin=num;
            }
        }
        // System.out.println(min+" "+smin);
        return (max*smax)-(min*smin);
        
    }
}