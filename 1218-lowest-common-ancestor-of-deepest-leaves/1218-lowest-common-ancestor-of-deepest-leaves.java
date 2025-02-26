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
    private int maxDepth =0;
    TreeNode ans ;
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        dfs(root,0);
        return ans;
    }
    public int  dfs(TreeNode root, int depth){
        if(root == null) return 0 ;
        if( root.left == null && root.right == null){ //
            if(depth >= maxDepth){
                maxDepth = depth;
                ans = root;
            } 
            return depth;
        }
        int left = dfs(root.left, depth+1);
        int right = dfs(root.right, depth+1);
        
        if(right == maxDepth && left == maxDepth){ // check if left == right == maxDepth
            ans = root;
        }
        return Math.max(left,right); // becoz to get maximum depth encountered from the current node

    }
}