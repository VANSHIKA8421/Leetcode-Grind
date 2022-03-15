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

//LRV
class Solution 
{
    public List<Integer> postorderTraversal(TreeNode root) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root,list);
        return list;
    }
    
    void helper(TreeNode node,ArrayList<Integer> list)
    {
        if(node==null)
        {
            return;
        }
        helper(node.left,list);
        helper(node.right,list);
        list.add(node.val);
    }
}