// import java.util.*;
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n=nums.length/3;
        List<Integer> res=new ArrayList<>();

        if(nums.length<3){
            for(int num:nums){
                if(!res.contains(num)){
                res.add(num);
                }
            }
            return res;
        }
        HashMap<Integer ,Integer> freq=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(freq.containsKey(nums[i])){
                freq.put(nums[i],freq.get(nums[i])+1);
                if(freq.get(nums[i])>n && !res.contains(nums[i])){
                    res.add(nums[i]);

                }
            }else{
                freq.put(nums[i],1);
            }
        }
        return res;
    }
}