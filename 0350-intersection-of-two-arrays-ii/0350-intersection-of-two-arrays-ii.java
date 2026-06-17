class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
     
        for(int i:nums1){
                if(hm.containsKey(i)){
                    hm.put(i,hm.get(i)+1);
                }else{
                    hm.put(i,1);
                }
        }
        for(int i:nums2){
               if(!hm.containsKey(i) || hm.get(i)<=0){
                continue;
               }else{
                    al.add(i);
                    hm.put(i,hm.get(i)-1);
               }
        }
        int[] nums=new int[al.size()];
        int count=0;
        for(int i:al){
             nums[count++]=i;
        }
        return nums;
    }
}