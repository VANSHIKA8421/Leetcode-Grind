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
    public int findBottomLeftValue(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
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
            
            ans.add(subres);
        }
        return ans.get(ans.size()-1).get(0);
    }
}