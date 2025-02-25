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
    List<Integer> ans;
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        ans.add(root.val);
        inorder(root.right);
        
    }
    public boolean isValidBST(TreeNode root) {
        if(root.left == null && root.right == null ) return true;
        ans = new ArrayList<>();
        inorder(root);
        List<Integer> sortedAns = new ArrayList<>(ans);
        Collections.sort(ans);
        // System.out.println(ans + "   "+ sortedAns);
        if( ans.get(0) != sortedAns.get(0)) return false;
        int prev = ans.get(0);
        for(int i = 1 ; i< ans.size() ; i++){
            if( ans.get(i) == prev) return false; 
            if(sortedAns.get(i) != ans.get(i)) return false;
            prev = ans.get(i);
        }
        return true;
    }
}