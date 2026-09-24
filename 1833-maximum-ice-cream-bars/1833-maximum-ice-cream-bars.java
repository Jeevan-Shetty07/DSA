class Solution {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);
        int ic = 0;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i] > coins)
                break;
            ic++;
            coins=coins-costs[i];
        }
        return ic;
    }
}