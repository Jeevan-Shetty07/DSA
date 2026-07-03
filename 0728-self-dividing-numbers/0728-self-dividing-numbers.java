class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            String num =String.valueOf(i);
            boolean div = true;
            for (char dig : num.toCharArray()) {
                if(dig=='0'){
                  div=false;
                  break;
                }
                int digit=(int)dig-'0';
                // System.out.println(digit);
                 if (i % digit != 0) {
                     div = false;
                 }
            }
            if(div)
              res.add(i);
        }
        return res;

    }
}