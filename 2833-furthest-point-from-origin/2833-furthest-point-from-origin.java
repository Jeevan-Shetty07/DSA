class Solution {
    public int furthestDistanceFromOrigin(String moves) {    
        int rcount=0, lcount=0,ucount=0;
        for(char c:moves.toCharArray()){
             if(c=='L'){
                  lcount++;
             }else if(c=='R'){
                rcount++;
             }else{
                ucount++;
             }
        }    
        // System.out.println(ucount+" "+rcount+" "+lcount);
        return Math.abs(rcount-lcount)+ucount;
    }
}