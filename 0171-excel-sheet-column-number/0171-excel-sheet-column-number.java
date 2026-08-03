class Solution {
    public int titleToNumber(String columnTitle) {
        int length=columnTitle.length();
        int num = columnTitle.charAt(length-1)-'A'+1;
        int mul=26;
        for(int i=length-2;i>=0;i--){
            int temp=(columnTitle.charAt(i)-'A')+1;
            num+=(mul*temp);
            mul=mul*26;
        }
        return num;

    }
}