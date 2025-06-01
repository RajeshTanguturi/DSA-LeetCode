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


    public int rob(TreeNode root) {
        int res[] =  dfs(root);
        return Math.max(res[0], res[1]);
    }
     // Returns int[2]: [notRobbed, robbed]
    private int[] dfs(TreeNode root) {
        if(root == null){
            return new int[2];
        }

        int left[] = dfs(root.left);
        int right[] = dfs(root.right);

        int notRob = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        int rob = root.val + left[0] + right[0];

        return new int[]{notRob, rob};



    }
}
