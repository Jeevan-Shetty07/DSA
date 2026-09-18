class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.put(arr[i],hs.getOrDefault(arr[i],0)+1);
        }
        for(int  num:hs.keySet()){
            s.add(hs.get(num));
        }   
       return hs.size()==s.size();
    }
}