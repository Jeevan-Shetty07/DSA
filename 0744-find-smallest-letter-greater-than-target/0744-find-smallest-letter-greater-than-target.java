class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        char  min='{';
       for(int i=0;i<letters.length;i++){
        // System.out.println(letters[i]>target && letters[i]<min);
           if(letters[i]>target && letters[i]<min){
            min=letters[i];
        
           }
        
       }
       return min=='{'?letters[0]:min;
    }
}