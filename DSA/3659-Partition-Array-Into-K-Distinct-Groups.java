class Solution {
    public boolean partitionArray(int[] nums, int k) {
        Map<Integer ,Integer > hm=new HashMap<>();
        if(nums.length%k!=0)
        return false;
        for(int num:nums){
            hm.put(num ,hm.getOrDefault(num,0)+1);
        }
        for(int key : hm.keySet()){
            if(hm.get(key)>nums.length/k){
                return false;
            }
        }
        return true;
        
    }
}