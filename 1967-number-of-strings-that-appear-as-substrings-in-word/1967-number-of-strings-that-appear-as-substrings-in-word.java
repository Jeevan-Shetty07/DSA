class Solution {
    public int numOfStrings(String[] patterns, String word) {
        
        int count=0;
        for(String w:patterns){
              System.out.println(w.indexOf(word));
            if(word.indexOf(w)>=0){
                // System.out.println(w.indexOf(word));
                count++;
            }
        }
        return count;
    }
}