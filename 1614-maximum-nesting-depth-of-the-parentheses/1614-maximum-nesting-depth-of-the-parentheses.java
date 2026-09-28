class Solution {
    public int maxDepth(String s) {
        // Stack<Character> st=new Stack<>();
        int depth=0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                // st.push('(');?
                depth++;
            } else if (s.charAt(i) == ')') {
                // st.pop();
                depth--;
            }
            
            max=Math.max(max,depth);
        }
        return max;
    }
}