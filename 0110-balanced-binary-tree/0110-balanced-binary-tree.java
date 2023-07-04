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
    public boolean isBalanced(TreeNode root) {
        return isBalanced(root, 1) > -1 ? true : false;
    }
    
    public int isBalanced(TreeNode root, int dept) {
        if(dept == -1 || root == null) 
            return dept;
        if(root.left == null && root.right == null) 
            return dept;
        
        int left = dept;
        int right = dept;
        
        //DFS
        if(root.left != null) 
            left = isBalanced(root.left, dept + 1);
        if(root.right != null) 
            right = isBalanced(root.right, dept + 1);
        
        if(left + 1 < right || left > right + 1) return -1;
        
        return left > right ? left : right;
    }
}