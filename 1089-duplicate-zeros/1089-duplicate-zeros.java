class Solution {
    public void duplicateZeros(int[] arr) {
        
        int[] aux=new int[arr.length];
        int pos=0;
        for(int num:arr){
            if(num!=0 && pos<arr.length){
                aux[pos++]=num;
            }else if(num==0 && pos<arr.length){
                aux[pos++]=0;
                if(pos<arr.length){
                aux[pos++]=0;
                }else{
                    break;
                }
            }
        }
        for(int i=0;i<aux.length;i++){
            arr[i]=aux[i];
        }

    }
}