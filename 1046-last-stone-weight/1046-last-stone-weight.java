class Solution {
    public int lastStoneWeight(int[] stones) {
        Queue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int stone:stones){
            q.add(stone);
        }
       while(q.size()>1){
          int diff=Math.abs(q.poll()-q.poll());
          q.add(diff);
       }
        return  q.poll();
    }
}