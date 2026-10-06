class Solution {
    List<List<Integer>> al=new ArrayList<>();
    public void subset(int indx,List<Integer> nal,int[] nums){
        if(indx>=nums.length){
            al.add(new ArrayList<>(nal));
            return;
        }
        nal.add(nums[indx]);
        subset(indx+1,nal,nums);
        nal.remove(nal.size()-1);
        subset(indx+1,nal,nums);


    }
    public List<List<Integer>> subsets(int[] nums) {
        subset(0,new ArrayList<>(),nums);
        return al;
    }
}