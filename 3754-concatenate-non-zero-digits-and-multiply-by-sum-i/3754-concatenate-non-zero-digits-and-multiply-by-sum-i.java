class Solution {
    public long sumAndMultiply(int n) {
        long sum = 0, ind = 0, place = 1;
        while (n > 0) {
            
            int dig = n % 10;
            if(dig==0){
                n/=10;
                continue;
            }
            ind = (dig * place) + ind;
            place*=10;
            sum = sum + dig;
            n /= 10;
        }
        // System.out.println(sum+" "+ind);

        return ind * sum;
    }

}