class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[]  freq=new int[1001];
        for(int i:nums1){
            freq[i]=++freq[i];
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:nums2){
            if(freq[i]>0){
                al.add(i);
                freq[i]=--freq[i];

            }
        }
        int[] res=new int[al.size()];
        for(int i=0;i<al.size();i++){
                 res[i]=al.get(i);
        }
     return res;
    }

}