
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> table = new HashMap<>();
        int ele;
        for (int i = 0; i < n; i++) {
            ele = nums[i];
          table.put(nums[i],table.getOrDefault(nums[i],0)+1);
            if (table.get(ele) == ((n / 2) + 1)) {
                return ele;
            }
        }
        return 0;
    }
}