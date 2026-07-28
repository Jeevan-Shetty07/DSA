class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()<2){
  return s;
        }
       char[] fhalf=s.substring(0,s.length()/2).toCharArray();
       Arrays.sort(fhalf);
       StringBuilder sb=new StringBuilder(new String(fhalf));
              StringBuilder sb1=new StringBuilder(new String(fhalf));

    sb.append(sb1.reverse());
       if(s.length()%2!=0){
        sb.insert(s.length()/2,s.charAt(s.length()/2));
       }
        return sb.toString();
    }
}