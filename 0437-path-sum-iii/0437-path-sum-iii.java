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
    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;
        return dfs(root, (long)targetSum) + pathSum(root.left, targetSum)+ pathSum(root.right, targetSum);
    }
    public int dfs(TreeNode root, long targetSum){
        if(root == null) return 0;
        int res = 0;
        if(targetSum == root.val ){
            res++;
        }
        res+=dfs(root.left, targetSum - root.val);
        res+=dfs(root.right, targetSum - root.val);
        return res;
    }
}