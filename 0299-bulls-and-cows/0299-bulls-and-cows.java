class Solution {
    public String getHint(String secret, String guess) {
        int b=0,h=0;
        // Map<Character,Integer> hm=new HashMap<>();
        int[] freq=new int[10];
        for(int i=0;i<secret.length();i++){
            freq[secret.charAt(i)-'0']++;
            if(secret.charAt(i)==guess.charAt(i)){
                b++;
            }
        }
        for(char c:guess.toCharArray()){
            if(freq[c-'0']>0){
                    h++;
            }
            freq[c-'0']--;
        }
        return b+"A"+(h-b)+"B";
    }
}