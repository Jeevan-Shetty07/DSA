class Solution {
    public void perm(Set<Integer> hs,int[] nums,ArrayList<Integer> tal,List<List<Integer>> al){
        if(tal.size()==nums.length){
               al.add(new ArrayList<>(tal));
               return;
        }
        for(int i=0;i<nums.length;i++){
            if(tal.contains(nums[i])){
                continue;
            }
            // hs.add(nums[i]);
            tal.add(nums[i]);
            perm(hs,nums,tal,al);
            // hs.remove(nums[i]);
            tal.remove(tal.size()-1);
        }

    }
    public List<List<Integer>> permute(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        List<List<Integer>> al=new ArrayList<>();
        perm(hs,nums,new ArrayList<>(),al);
        return al;
    }
}