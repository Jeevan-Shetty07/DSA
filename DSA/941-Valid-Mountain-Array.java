class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length <= 2) {
            return false;
        }

        int i = 1;

      
        for (; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                break;
            }
        }

        
        i--;

        
        if (i == 0 || i == arr.length - 1) {
            return false;
        }

        
        for (; i < arr.length - 1; i++) {
            if (arr[i] <= arr[i + 1]) {
                return false;
            }
        }

        return true;
    }
}