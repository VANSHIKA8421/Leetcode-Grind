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
class Solution 
{
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); int level = 0;
        while(q.size()!=0)
        {
            int size = q.size();
            List<Integer> subres = new LinkedList<>();
            
            for(int i = 0 ; i < size; i++)
            {
                
                if(q.peek().left!=null) q.offer(q.peek().left);
                if(q.peek().right!=null) q.offer(q.peek().right);
                subres.add(q.poll().val);
            }
            
            if(level%2==0) ans.add(subres);
            else {
                Collections.reverse(subres);
                ans.add(subres);
            }
            
            level++;
        }
        return ans;
    }
}
