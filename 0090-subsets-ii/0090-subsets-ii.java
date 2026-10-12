class Solution {
    List<List<Integer>> al = new ArrayList<>();
    Set<List<Integer>> set = new HashSet<>();

    public void subset(int indx, List<Integer> nal, int[] nums) {
        if (indx >= nums.length) {
            
            if (!set.contains(new ArrayList<>(nal))) {
                al.add(new ArrayList<>(nal));
            }
            set.add(new ArrayList<>(nal));
            return;
        }
        nal.add(nums[indx]);
        subset(indx + 1, nal, nums);
        nal.remove(nal.size() - 1);
        subset(indx + 1, nal, nums);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        subset(0, new ArrayList<>(), nums);
        return al;

    }
}