class Solution {
    public String toLowerCase(String s) {
       char[] arr=s.toCharArray();
       
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
            arr[i]=(char)(arr[i]+32);
        }else
        arr[i]=s.charAt(i);
       }
       return new String(arr);
    }
}