class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0, bit, temp = x;
        boolean flag;
        while (temp > 0) {
            bit = temp % 10;
            rev = (rev * 10) + bit;
            temp = temp / 10;
        }
        if (rev == x) {
            return true;
        } else {
            return false;
        }

    }
}