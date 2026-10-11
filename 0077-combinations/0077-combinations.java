class Solution {
    void comb(int num, ArrayList<Integer> temp,List<List<Integer>> ls,int k,int n){
      
        if(temp.size()==k){
            ls.add(new ArrayList<>(temp));
            return;
        }
          if(num>n){
            return;
        }
        
        temp.add(num);
        comb(num+1,temp,ls,k,n);
        temp.remove(temp.size()-1);
        comb(num+1,temp,ls,k,n);
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ls=new ArrayList<>();
        comb(1,new ArrayList<>(),ls,k,n);
        return ls;
    }
}