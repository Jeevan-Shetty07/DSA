class Solution {
    List<List<Integer>> al = new ArrayList<>();
   

    public void subset(int indx, List<Integer> nal, int[] nums) {
     
            al.add(new ArrayList<>(nal));
            
        
        for (int i = indx; i < nums.length; i++) {
            if (i > indx && nums[i] == nums[i - 1]) {
                continue;
            }
            nal.add(nums[i]);
            subset(i+1, nal, nums);
            nal.remove(nal.size() - 1);
           

        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subset(0, new ArrayList<>(), nums);
        return al;

    }
}