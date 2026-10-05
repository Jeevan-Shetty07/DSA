class Solution {
    List<Integer> al=new ArrayList<>();
    public void add(int dig){
        if(dig<=0){
            return;
        }
        add(dig/10);
        al.add(dig%10);
    }
    public int[] separateDigits(int[] nums) {
         for(int num:nums){
            add(num);
         }
         int[] ans=new int[al.size()];
         for(int i=0;i<ans.length;i++){
                ans[i]=al.get(i);
         }
         return ans;
       
    }
    
}