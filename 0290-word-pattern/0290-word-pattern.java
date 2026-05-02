class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<String,Character> map=new HashMap<>();
        HashSet<Character> unique=new HashSet<>();

        if(s.split(" ").length != pattern.length()){
            return false;
        }
        int num=0;
        for(String word:s.split(" ")){
           
            if(!map.containsKey(word)){
                if(unique.contains(pattern.charAt(num))){
                    return false;
                }else{
                map.put(word,pattern.charAt(num));
                unique.add(pattern.charAt(num++));
                }
            }else{
              if( num == pattern.length() || pattern.charAt(num)!=map.get(word)){
                    return false;
                }else{
                    num++;
                }
            }
        }
        return true;
          }
}