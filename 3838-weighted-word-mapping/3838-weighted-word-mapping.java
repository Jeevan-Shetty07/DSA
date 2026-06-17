class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int sum;
        StringBuilder sb=new StringBuilder();
        for (String word : words) {
            sum = 0;
            for (char c : word.toCharArray()) {
                sum += weights[c - 'a'];
            }
            sb.append((char) ('z' - (sum % 26)));
        }
        return sb.toString();
    }
}