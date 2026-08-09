class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        
        Arrays.sort(players);
        Arrays.sort(trainers);
        int pl=players.length,tl=trainers.length,pc=0,tc=0,count=0;
        while(pc<pl && tc<tl){
            if(players[pc]<=trainers[tc]){
                  count++;
             
                pc++;
            }
            tc++;
        }
        return count;
        
    }
}