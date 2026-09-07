class Solution {
    public int buyChoco(int[] prices, int money) {
        int min=Integer.MAX_VALUE,smin=Integer.MAX_VALUE;
        for(int price:prices){
            if(price<=min){
                smin=min;
                min=price;
            }else if(price<smin){
                smin=price;
            }
        }
        System.out.println(min+" "+smin);
        return min+smin<=money?money-(min+smin):money;
        
    }
}