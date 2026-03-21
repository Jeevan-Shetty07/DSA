class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rowstart=0;
        int rowend=matrix.length-1;
        int colstart=0;
        int colend=matrix[0].length-1;
        int count=(rowend+1)*(colend+1);
        // int[] res=new int[rowend*colend];
      ArrayList<Integer> res=new ArrayList<>();
      while(true){
        for(int i=colstart;i<=colend;i++){
            res.add(matrix[rowstart][i]);
            count--;
        }
        
        rowstart++;
        if(count==0){
            return res;
        }
        for(int i=rowstart;i<=rowend;i++){
            res.add(matrix[i][colend]);
            count--;
        }
         if(count==0){
            return res;
        }
        colend--;
        for(int i=colend;i>=colstart;i--){
             res.add(matrix[rowend][i]);
             count--;
        }
         if(count==0){
            return res;
        }
            rowend--;
        for(int i=rowend;i>=rowstart;i--){
             res.add(matrix[i][colstart]);
             count--;
        }
         if(count==0){
            return res;
        }
        colstart++;
        
      }
    // return res;
    }
}

