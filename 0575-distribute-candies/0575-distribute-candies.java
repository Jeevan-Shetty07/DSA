class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> hs=new HashSet<>();
        for(int candy:candyType){
            hs.add(candy);
        }
        int len=candyType.length/2;
        int size=hs.size();
        return size>len?len:size;
    }
}