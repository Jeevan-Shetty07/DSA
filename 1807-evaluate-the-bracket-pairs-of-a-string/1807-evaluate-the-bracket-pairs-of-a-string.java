class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String, String> hm=new HashMap<>();
        for(List<String> key:knowledge){
            hm.put(key.get(0),key.get(1));
            // System.out.println(key.get(0)+" "+key.get(1));
        }
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                StringBuilder temp=new StringBuilder("");
            
                while(s.charAt(++i)!=')'){
                    temp.append(s.charAt(i));
                }
                // System.out.print(temp);
                sb.append(hm.getOrDefault(temp.toString(),"?"));
            }else{
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}