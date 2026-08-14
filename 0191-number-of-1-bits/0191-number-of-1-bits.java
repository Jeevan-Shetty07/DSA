class Solution {
    public int hammingWeight(int n) {
        String bin=Integer.toBinaryString(n);
        int count=0;
         for(char a:bin.toCharArray()){
            if(a=='1'){
                count++;
            }
         }
        return count;
    }
}