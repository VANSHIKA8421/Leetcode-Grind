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
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> list = new ArrayList<>();
        helper(root,0,list);
        return list;
    }
    void helper( TreeNode node, int level, List<List<Integer>> list)
    {
        if(node == null)
        {
            return;
        }
        if(list.size()==level)
        {
            list.add( new ArrayList<Integer>());
        }
        list.get(level).add(node.val);
        helper(node.left,level+1,list);
        helper(node.right,level+1,list);
        
    }
}