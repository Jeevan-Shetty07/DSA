class Solution {
    public int countKeyChanges(String s) {
        int change=0;
        s=s.toLowerCase();
        if(s.length()==1){
            return 0;
        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)!=(s.charAt(i+1))){
                change++;
            }
        }
        return change;
        
    }
}