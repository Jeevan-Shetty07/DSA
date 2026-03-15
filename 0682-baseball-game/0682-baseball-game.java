class Solution {
    public int calPoints(String[] operations) {
        int pos=0;
           int sum=0;
        int[] elements=new int[operations.length];
        for(String s:operations){
            if(s.equals("+")){
               elements[pos]=elements[pos-1]+elements[pos-2];
               sum+=elements[pos++];
            }else if(s.equals("D")){
                elements[pos]=elements[pos-1]*2;
                sum+=elements[pos];
                pos++;
            }else if(s.equals("C")){
                sum-=elements[--pos];
                elements[pos]=0;
                
            }else{
                elements[pos]=Integer.parseInt(s);
                sum+=elements[pos];
                pos++;
            }
        }
     
       
        return sum;
    }
}