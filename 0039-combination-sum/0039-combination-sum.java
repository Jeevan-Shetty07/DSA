class Solution {
    List<List<Integer>> al = new ArrayList<>();

    public void sum(int indx, List<Integer> tal, int sum,  int[] candidates,int target) {

        if (target == sum) {
            al.add(new ArrayList<>(tal));
            return;
        }
        if(sum>target || indx>=candidates.length){
            return ;
        }


        tal.add(candidates[indx]);
        sum+=candidates[indx];

        sum(indx, tal, sum, candidates,target);
        sum -= tal.get(tal.size() - 1);
        tal.remove(tal.size() - 1);
        sum(indx + 1, tal, sum, candidates, target);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        sum(0, new ArrayList<>(), 0, candidates,target);
        return al;

    }
}