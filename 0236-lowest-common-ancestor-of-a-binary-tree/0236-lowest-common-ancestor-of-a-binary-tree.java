/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if( root == null) return null;
        if( root == p || root == q) return root;
        // if( root.left  ==  null && root.right == null) return null;
        TreeNode left = lowestCommonAncestor(root.left, p,q);
        TreeNode right = lowestCommonAncestor(root.right, p,q);
        if(left != null && right != null ) return root;
        else if( left != null ) return left;
        else if( right!= null ) return right;
        else return null;

    }
}