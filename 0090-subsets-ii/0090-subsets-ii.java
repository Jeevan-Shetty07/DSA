class Solution {
   

    public void subset(int indx, List<Integer> nal, int[] nums,List<List<Integer>> al) {
     
            al.add(new ArrayList<>(nal));
            
        
        for (int i = indx; i < nums.length; i++) {
            if (i > indx && nums[i] == nums[i - 1]) {
                continue;
            }
            nal.add(nums[i]);
            subset(i+1, nal, nums,al);
            nal.remove(nal.size() - 1);
           

        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
    List<List<Integer>> al = new ArrayList<>();
        Arrays.sort(nums);
        subset(0, new ArrayList<>(), nums,al);
        return al;

    }
}