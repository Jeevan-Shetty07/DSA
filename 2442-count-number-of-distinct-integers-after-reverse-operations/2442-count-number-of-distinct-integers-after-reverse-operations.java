class Solution {
    public int reverse(int num){
        int new1=0;
        int pos=1;
        while(num>0){
            new1=(new1*10)+(num%10);
            num=num/10;
        }
        return new1;
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> hs=new HashSet<>();
       for(int num:nums){
             hs.add(num);
             hs.add(reverse(num));
       }
      return hs.size();
    }
}