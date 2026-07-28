class Solution {
    public String smallestPalindrome(String s) {
        int length=s.length();
        if(s.length()<2){
  return s;
        }
       char[] fhalf=s.substring(0,length/2).toCharArray();
       Arrays.sort(fhalf);
       StringBuilder sb=new StringBuilder(new String(fhalf));
              StringBuilder sb1=new StringBuilder(new String(fhalf));

    sb.append(sb1.reverse());
       if(length%2!=0){
        sb.insert(length/2,s.charAt(length/2));
       }
        return sb.toString();
    }
}