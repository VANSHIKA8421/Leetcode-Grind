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

// LVR
class Solution 
{
    public List<Integer> inorderTraversal(TreeNode root) 
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        helper(root,list);
        return list;
    }
        void helper( TreeNode node, ArrayList<Integer> list)
        {
            if(node==null)
            {
                return;
            }
            helper(node.left, list);
            list.add(node.val);
            helper(node.right,list);
            
        }
    
}