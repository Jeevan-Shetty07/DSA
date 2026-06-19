class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0,length=numbers.length, right =length - 1, sum = numbers[left] + numbers[right];
        int[] res = { 0+1, length };
        while (left < right) {
            if (sum == target) {
                return res;
            } else if (sum > target) {
                sum = numbers[left] + numbers[--right];
            }else{
                sum=numbers[++left]+numbers[right];
            }
            res[0]=left+1;
            res[1]=right+1;
        }
        return new int[2];
    }
}