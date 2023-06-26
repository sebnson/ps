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
        /*
        while((root.val - p.val)*(root.val-q.val)>0){ //when value of root node is bigger
            if (root.val > p.val){
                root = root.left; //left TreeNode on root
            }else{ //when root.val <= p.val
                root = root.right; //right TreeNode on root
            } 
        }
        return root; // 0, -1000000, 100000인 케이스에서 오류 발생
        */
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }else if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }else{
            return root;
        }
    }
}