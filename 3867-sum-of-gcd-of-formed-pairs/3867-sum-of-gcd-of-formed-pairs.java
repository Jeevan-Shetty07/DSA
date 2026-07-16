class Solution {
    public long gcd(long a,long b){
          return b==0?a:gcd(b,a%b);
    }
    public long gcdSum(int[] nums) {
        long[] prefixGcd = new long[nums.length];
        int count=0,lcount=nums.length-1;
        long max = 0;
        for (long num : nums) {
            max = Math.max(max,num);
            prefixGcd[count++]=gcd(num,max);
        }
        count=0;
        Arrays.sort(prefixGcd);
        long sum=0;
         while(count<lcount){
            sum+=gcd(prefixGcd[count++],prefixGcd[lcount--]);
            // System.out.println(sum);
         }
        return sum;
    }
}