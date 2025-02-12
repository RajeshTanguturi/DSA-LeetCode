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
    public TreeNode build(int[] inorder, int[] postorder,Map<Integer,Integer> inorderIdx,int start, int end, int[] postIdx ){
        if(start> end) return null;
        TreeNode root = new TreeNode(postorder[postIdx[0]--]);
        int idx = inorderIdx.get(root.val);
        root.right = build(inorder,postorder,inorderIdx,idx+1,end,postIdx);
        root.left = build(inorder,postorder,inorderIdx,start,idx-1,postIdx);
        return root;

    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = inorder.length;
        Map<Integer,Integer> inorderIdx = new HashMap<>();
        for( int i  = 0 ; i < n ; i++){
            inorderIdx.put(inorder[i],i);
        } 
        int postIdx[] = new int[]{ n-1 };
        return build(inorder,postorder,inorderIdx,0,n-1,postIdx);
    }
}