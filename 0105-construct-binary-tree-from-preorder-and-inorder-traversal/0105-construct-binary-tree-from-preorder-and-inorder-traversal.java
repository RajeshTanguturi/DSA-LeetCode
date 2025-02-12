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
    public TreeNode build(int[] inorder, int[] preorder,Map<Integer,Integer> inorderIdx,int start, int end, int[] preIdx ){
        if(start> end) return null;
        TreeNode root = new TreeNode(preorder[preIdx[0]++]);
        int idx = inorderIdx.get(root.val);
        root.left = build(inorder,preorder,inorderIdx,start,idx-1,preIdx);
        root.right = build(inorder,preorder,inorderIdx,idx+1,end,preIdx);
        return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = inorder.length;
        Map<Integer,Integer> inorderIdx = new HashMap<>();
        for( int i  = 0 ; i < n ; i++){
            inorderIdx.put(inorder[i],i);
        } 
        int preIdx[] = new int[]{ 0 };
        return build(inorder,preorder,inorderIdx,0,n-1,preIdx);
    }
}