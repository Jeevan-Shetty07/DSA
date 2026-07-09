class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
     HashSet<Integer> hs=new HashSet<Integer>();
     HashSet<Integer> al=new HashSet<Integer>();
     for(int  ele:nums1){
        hs.add(ele);
     }
     for(int ele:nums2){
        if(hs.contains(ele) ){
           al.add(ele);
        }
     }
     int[] res=new int[al.size()];
     int count=0;
     for(int num:al){
           res[count++]=num;
     }
     return res;
    
    }
}