class Solution {
    public String processStr(String s) {
           StringBuilder sb=new StringBuilder();
           for(char c:s.toCharArray()){
            if(c>='a' && c<='z'){
                sb.append(c);
            }
            if(sb.length()-1!=-1){
             if(c=='*'){
                sb.deleteCharAt(sb.length()-1);
            }else if(c=='#'){
                sb.append(sb);
            }else if(c=='%'){

                sb.reverse();
            }
            }
           }
           return sb.toString();
    }
}