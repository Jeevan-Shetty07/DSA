class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prf = "";
        StringBuilder sub = new StringBuilder(strs[0]);
        for(int i=0;i<strs.length;i++){
            if(sub.toString().length()>strs[i].length()){
                sub=new StringBuilder(strs[i]);
            }
        }

       while(sub.length()>0){
            boolean flag=true;
            for (int j = 0; j < strs.length; j++) {
               

                if (strs[j].startsWith(sub.toString())) {
                  
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                prf = sub.toString();
                break;
                
            }
            sub.deleteCharAt(sub.length()-1);

        }
        return prf;
    }
}