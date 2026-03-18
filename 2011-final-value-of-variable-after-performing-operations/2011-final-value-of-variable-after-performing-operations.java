class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int num=0;
        for(String s:operations){
            if(s.contains("-")){
             num-=1;
            }else{
                num+=1;
            }
        }
   return  num;
    }
}