class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> hm=new HashMap<>();
        for(int i=0;i<edges.length;i++){
               hm.put(edges[i][0],hm.getOrDefault(edges[i][0],0)+1);
               hm.put(edges[i][1],hm.getOrDefault(edges[i][1],0)+1);

        }
        for(int ele:hm.keySet()){
            if(hm.get(ele)==edges.length){
                return ele;
            }
        }
        return 1;
    }
}