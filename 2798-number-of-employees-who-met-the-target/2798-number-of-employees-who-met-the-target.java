class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count =0;
        Arrays.sort(hours);
        int i=hours.length-1;
        while(count != hours.length &&  hours[i]>=target ){
            count++;
            i--;
        }
        return count;
    }
}