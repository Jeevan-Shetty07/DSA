/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> qu = new LinkedList<>();
        Queue<TreeNode> qu1 = new LinkedList<>();
        if (p == null && q == null) {
            return true;
        }
        if (p==null || q==null || p.val != q.val) {
            return false;
        }

        qu.offer(p);
        qu1.offer(q);
        while (!qu.isEmpty()) {
            if (qu.size() != qu1.size()) {
                return false;
            }
            int n = qu.size();
            for (int i = 0; i < n; i++) {
                TreeNode temp = qu.poll();
                TreeNode temp1 = qu1.poll();
                if (temp.val != temp1.val) {
                    return false;
                }
                if (temp.left != null) {
                    if (temp1.left == null) {
                        return false;
                    }
                    qu.offer(temp.left);
                }
                if (temp.right != null) {
                    if (temp1.right == null) {
                        return false;
                    }
                    qu.offer(temp.right);
                }
                if (temp1.left != null) {
                    if (temp.left == null) {
                        return false;
                    }
                    qu1.offer(temp1.left);
                }
                if (temp1.right != null) {
                    if (temp.right == null) {
                        return false;
                    }
                    qu1.offer(temp1.right);
                }
            }
        }
        return true;
    }
}