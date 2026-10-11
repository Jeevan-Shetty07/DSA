class Solution {

    public void csum(int indx,int sum,int[] candidates,ArrayList<Integer> temp,List<List<Integer>> al,int target) {
        if(sum==target){
            al.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target){
            return;
        }
        for(int i=indx;i<candidates.length;i++){
            if(i>indx && candidates[i]==candidates[i-1]){
                continue;
            }
            temp.add(candidates[i]);
            sum+=candidates[i];
            csum(i+1,sum,candidates,temp,al,target);
            sum-=temp.get(temp.size()-1);
            temp.remove(temp.size()-1);
        }

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
       List<List<Integer>> al=new ArrayList<>();
        csum(0,0,candidates,new ArrayList<>(),al,target);
        return al;
    }
}
