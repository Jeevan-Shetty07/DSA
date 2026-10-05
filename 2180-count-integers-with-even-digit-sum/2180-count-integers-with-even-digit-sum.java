class Solution {
    // public boolean isSum(int num){
    //     int sum=0;
    //     while(num>0){
    //         sum+=(num%10);
    //         num/=10;
    //     }
    //     return sum%2==0;
    // }
    public int countEven(int num) {
      
        if (num < 10) {
            return num / 2;
        }
       int count=4;
        int sum = 0;
        for (int i = 10; i <= num; i++) {

            if (i % 10 == 0) {
                int n = i;
                sum = 0;
                while (n > 0) {
                    sum += (n % 10);
                    n /= 10;
                }
                sum--;
            }
            sum++;
            if (sum % 2 == 0)
                count++;
            
        }
        return count;
    }
}