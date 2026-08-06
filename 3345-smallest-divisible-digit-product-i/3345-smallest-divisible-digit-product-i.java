class Solution {
    public int smallestNumber(int n, int t) {
         if(n==100 ){
            return n;
         }
         if(n<10 && n%t!=0){
            return n+(t-(n%t))>=10?10:n+(t-(n%t));
         }
         int ldig=n%10,fdig=n/10;
        //  System.out.println(fdig+" "+ldig);
         for(int i=ldig;i<10;i++){
            if((i*fdig)%t==0){
                return (fdig*10)+i;
            }
         }

      return (fdig+1)*10;
    }
}