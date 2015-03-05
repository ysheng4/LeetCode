/*
  Definition for a binary tree
  class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x){
      val=x;
    }
  }
*/

public class Solution{
  public List<Integer> postorderTraversal(TreeNode root){
      List<Integer> res=new ArrayList<>();
      if(root==null)
      return res;
      
      Stack<TreeNode> stack=new Stack<>();
      stack.push(root);
      while(!stack.isEmpty()){
        TreeNode cur=stack.peek();
        if(cur.left==null&&cur.right==null){
          res.add(cur.val);
          stack.pop();
        }
        if(cur.left!=null){
          stack.push(cur.left);
          cur.left=null;
          continue;
        }
        if(cur.right!=null){
          stack.push(cur.right);
          cur.right=null;
          continue;
        }
      }
      return res;
    
  }
}
