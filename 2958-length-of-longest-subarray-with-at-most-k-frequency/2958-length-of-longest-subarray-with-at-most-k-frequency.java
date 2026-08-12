class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int start = 0, end = 0,max=0;
        Map<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            end++;

            while (hm.get(nums[i]) > k) {
                hm.put(nums[start], hm.get(nums[start]) - 1);
                start++;
            }
            max=Math.max(end-start,max);

        }

        return max;
    }
}