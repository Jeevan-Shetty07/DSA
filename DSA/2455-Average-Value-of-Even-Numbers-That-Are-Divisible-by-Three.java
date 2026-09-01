class Solution {
    public int averageValue(int[] nums) {
        int sum = 0, ele = 0;
        for (int num : nums) {
            if (num % 3 == 0 && num%2==0) {
                  sum=sum+num;
                  ele++;
            }
        }
        // System.out.println(sum+" "+ele);
       
        return ele==0?0:sum/ele;
    }
}