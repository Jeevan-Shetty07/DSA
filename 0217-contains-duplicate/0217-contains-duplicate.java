class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numset=new HashSet<>();
       
        for(int num:nums){
           if(!numset.add(num)){
                  return true;
           }
        }
        return false;
    }
}