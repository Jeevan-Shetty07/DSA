class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
         List<String> al=new ArrayList<>();
        if(s.length()<10){
            return al;
        }
        StringBuilder sb=new StringBuilder(s.substring(0,9));
        Map<String,Integer> hm=new HashMap<String,Integer>();
       
        for(int i=9;i<s.length();i++){
        
            sb.append(s.charAt(i));
            String temp=sb.toString();
            hm.put(temp,hm.getOrDefault(temp,0)+1);
            if(hm.get(temp)==2  ){
                al.add(temp);
            }
            sb.delete(0,1);
        }
     return al;
        
    }
}