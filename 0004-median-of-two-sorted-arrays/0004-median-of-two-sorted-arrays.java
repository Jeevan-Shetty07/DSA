class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length+nums2.length];
     
        int indx=0;
        int length=res.length;
         for(int num:nums1){
            res[indx++]=num;
         }
         for(int num:nums2){
            res[indx++]=num;
         }
            if(length==1){
            return res[0];
        }
        Arrays.sort(res);
         float mid=0,num1;
         if(length%2==0){
            float num2;
               num1=res[length/2];
               num2=res[(length/2)-1];
               mid=(num1+num2)/2;
           
         }else if(length%2==1){
                mid=res[length/2];
               
         }
         return mid;
    }
}