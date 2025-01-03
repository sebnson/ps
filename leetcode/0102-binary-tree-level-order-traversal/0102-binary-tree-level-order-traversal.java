/* Definition for a binary tree node.
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}*/

//BFS
class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null)
      return new ArrayList<>();

    List<List<Integer>> ans = new ArrayList<>();
    Queue<TreeNode> que = new ArrayDeque<>(Arrays.asList(root)); //que for BFS

    while (!que.isEmpty()) {
      List<Integer> currLevel = new ArrayList<>();
      for (int nodeSize = que.size(); nodeSize > 0; --nodeSize) { //현재 레벨 노드 개수 ㅜnodeSize
        TreeNode node = que.poll(); //탐색을 위한 노드 from que
          
        currLevel.add(node.val);
        if (node.left != null)
          que.offer(node.left);
        if (node.right != null)
          que.offer(node.right);
      }
      ans.add(currLevel);
    }

    return ans;
  }
}