class Solution {
    public boolean isValid(String s) {
      int[] stack = new int[8360];

        int top=-1;
        boolean flag=false;
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i)=='{' ){
                stack[++top]=s.charAt(i);
                flag=false;
             }
             else{
                 if(top==-1){
                         flag=false;
                         return flag;
                }
                else if(s.charAt(i)==')' && stack[top]=='('){
                    top--;
                    flag=true;
                    continue;
                }else  if(s.charAt(i)==']' && stack[top]=='['){
                   top--;
                   flag=true;
                     continue;
                }else  if(s.charAt(i)=='}' && stack[top]=='{'){
                   top--;
                   flag=true;
                     continue;
                }else{
                    flag=false;
                    return flag;
                }


             }
        }
        if(top==-1){
              return true;
        }else{
            return false;
        }
        
    }
}
