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
    private boolean isValidBST(TreeNode root, long minRange, long maxRange){
        if( root == null) return true;
        if(!(minRange < root.val  && root.val < maxRange)) return false;
        return isValidBST(root.left, minRange, root.val) && isValidBST(root.right, root.val, maxRange);
    }
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root,Long.MIN_VALUE, Long.MAX_VALUE);
    }
}