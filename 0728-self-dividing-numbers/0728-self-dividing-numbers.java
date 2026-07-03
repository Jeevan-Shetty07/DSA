class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            String num = String.valueOf(i);
            if (num.indexOf('0') == -1) {

                boolean div = true;
                for (char dig : num.toCharArray()) {

                    int digit = (int) dig - '0';
                    if (i % digit != 0) {
                        div = false;
                    }
                }
                if (div)
                    res.add(i);
            }

        }
        return res;

    }
}