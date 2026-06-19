class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numset=new HashSet<>();
       
        // boolean flag=false;
        for(int i=0;i<nums.length;i++){
            int number=nums[i];
            if(numset.contains(number)){
                return true;
            }
            numset.add(number);
        }
        return false;
    }
}