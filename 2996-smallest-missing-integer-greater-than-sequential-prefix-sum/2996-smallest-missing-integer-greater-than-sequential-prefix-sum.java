class Solution {
    public int missingInteger(int[] nums) {
        int prev = nums[0];
        Set<Integer> hs = new HashSet<>();
        hs.add(prev);
        int sum = prev;
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != prev + 1) {
                break;
            } else {
                sum += nums[i];
                prev=nums[i];
            }
        }
        for(int i:nums){
            hs.add(i);
        }
        while(hs.contains(sum)){
            sum++;
        }

        return sum;

        

    }
}