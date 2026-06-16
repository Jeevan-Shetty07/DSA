class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length+nums2.length];
     
        int indx=0;
         for(int num:nums1){
            res[indx++]=num;
         }
         for(int num:nums2){
            res[indx++]=num;
         }
            if(res.length==1){
            return res[0];
        }
        Arrays.sort(res);
         float mid=0,num1;
         if(res.length%2==0){
            float num2;
               num1=res[res.length/2];
               num2=res[(res.length/2)-1];
            mid=(num1+num2)/2;
           
         }else if(res.length%2==1){
                mid=res[(int)(res.length/2)];
               
         }
         return mid;
    }
}