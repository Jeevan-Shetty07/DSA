class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 2) {
            return false;
        }

        int i = 1;

        // Increasing part
        for (; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                break;
            }
        }

        // i-1 is the peak
        i--;

        // Peak cannot be first or last
        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        // Decreasing part
        for (; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}