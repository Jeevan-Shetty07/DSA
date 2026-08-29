class Solution {
    public String digitSum(String s, int k) {
        StringBuilder sb = new StringBuilder(s);
        while (sb.length() > k) {

            StringBuilder sb1 = new StringBuilder("");
            int sum = 0;
            for (int i = 0; i < sb.length(); i++) {
                if (i % k == 0 && i != 0) {
                    sb1.append(String.valueOf(sum));
                    sum = 0;
                }
                sum += (sb.charAt(i) - '0');
            }
            // if (sb.length() % k != 0) {
                sb1.append(String.valueOf(sum));
            // }
            sb = sb1;
                      System.out.println(sb);

        }
        return sb.toString();
    }
}