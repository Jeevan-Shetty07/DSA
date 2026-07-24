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
           
            hm.put(sb.toString(),hm.getOrDefault(sb.toString(),0)+1);
            //  System.out.println(hm.get(sb.toString())+" "+i);
            if(hm.get(sb.toString())==2  ){
                al.add(sb.toString());
            }
            sb.delete(0,1);


        }
  return al;
        
    }
}