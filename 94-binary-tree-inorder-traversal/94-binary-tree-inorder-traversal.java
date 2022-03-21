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

//LVR left ver right 
class Solution 
{
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;
        helper_inorder(root,list);
        return list;
    }
    void helper_inorder( TreeNode node, List<Integer> list)
    {
        if(node == null ) return;
        helper_inorder(node.left,list);
        list.add(node.val);
        helper_inorder(node.right,list);
    }
}