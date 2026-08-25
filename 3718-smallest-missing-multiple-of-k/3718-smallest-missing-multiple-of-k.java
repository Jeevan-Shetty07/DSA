class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> hs=new HashSet<>();
        for(int num:nums){
            if(num%k==0){
            hs.add(num);
            
            }
        }
        int n=k;
        while(hs.contains(k)){
            k+=n;
        }
        return k;
    }
}