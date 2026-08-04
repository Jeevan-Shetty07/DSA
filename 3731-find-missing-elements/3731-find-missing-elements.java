class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max = 0, min = 101;
        HashSet<Integer> hs =new HashSet<>();
        ArrayList<Integer> al=new ArrayList<>();

        for (int num : nums) {
            hs.add(num);
            max = num > max ? num : max;
            min = num < min ? num : min;
        }
        for(int i=min;i<=max;i++){
            if(!hs.contains(i)){
                al.add(i);
            }
        }
        return al;
    }
}