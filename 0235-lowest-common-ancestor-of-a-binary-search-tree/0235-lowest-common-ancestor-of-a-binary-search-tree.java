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
        if( root == null ||  root == p || root == q) return root;
        if((root.val > p.val && root.val < q.val ) || (root.val > q.val && root.val < p.val )) return root;
        if( root.val > p.val && root.val > q.val){
            return  lowestCommonAncestor(root.left, p,q);
        }
        if( root.val < p.val && root.val < q.val){
            return  lowestCommonAncestor(root.right, p,q);
        }
        return null;
        // if(left == null ) return right;
        // else if(right == null ) return left;
        // else return root;
    }
}