class Solution {
    public int calPoints(String[] operations) {
        int pos=0;
        int[] elements=new int[operations.length];
        for(String s:operations){
            if(s.equals("+")){
               elements[pos++]=elements[pos-2]+elements[pos-3];
            }else if(s.equals("D")){
                elements[pos]=elements[pos-1]*2;
                pos++;
            }else if(s.equals("C")){
                elements[--pos]=0;
                
            }else{
                elements[pos++]=Integer.parseInt(s);
            }
        }
        int sum=0;
        for(int ele : elements){
            sum+=ele;
        }
        return sum;
    }
}