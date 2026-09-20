class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int pos=1;
        for (char ch : s.toCharArray()) {
            sum += (('z' - ch) + 1) * pos;
            // System.out.println(sum);
            pos++;
        }
        return sum;

    }
}