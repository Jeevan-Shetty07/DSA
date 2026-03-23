import java.util.Hashtable;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
          Hashtable<Integer ,Integer > dup=new Hashtable<>();
          int count=0;
          for(int num:nums){
            if(dup.containsKey(num)){
                if(count-dup.get(num)<=k){
                    return true;
                }else{
                    dup.put(num,count);
                }
            }else{
                dup.put(num,count);
            }
            count++;
          }
          return false;
    }
}