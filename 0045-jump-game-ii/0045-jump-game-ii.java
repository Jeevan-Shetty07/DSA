class Solution {
    public int jump(int[] nums) {
        int start = 0, end = 0, count = 0;
        int length = nums.length;

        while (end < length - 1) {
            int nend = end;

            while (start <= end) {
                nend = Math.max(nend, start + nums[start]);
                start++;
            }

            count++;
            end = nend;
        }

        return count;
    }
}