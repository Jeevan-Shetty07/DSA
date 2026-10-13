class Solution {
    public long maxAlternatingSum(int[] nums) {
        Queue<Integer> q=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){  
                q.add((nums[i]*nums[i]));
        }
  
        long sum=0;
        int neg=nums.length/2;
        for(int i=0;i<nums.length;i++){
            if(i<neg){
                sum-=q.poll();
            }else{
                 sum+=q.poll();
            }
        }
        return sum;

        
    }
}