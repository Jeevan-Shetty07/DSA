class Solution {
    public boolean isHappy(int n) {
        int num = n;
        Set<Integer> hs = new HashSet<>();
        while (num != 1) {
            int number=num;
            int sum=0;
            while(number>0){
                int digit=number%10;
                sum+=(digit*digit);
                number=number/10;

            }
            if(hs.contains(sum)){
                return false;
            }
            // System.out.println(sum);
            hs.add(sum);
            num=sum;
        }
        return true;
    }
}