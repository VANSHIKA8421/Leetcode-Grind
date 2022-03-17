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
    public int maxPathSum(TreeNode root) 
    {
        int[] maxSum = new int[1];
        maxSum[0]= Integer.MIN_VALUE;
        sumFinder(root,maxSum);
        return maxSum[0];
    }
    private int sumFinder( TreeNode node, int[] maxSum)
    {
        if(node==null) return 0;
        int ls = Math.max(0,sumFinder(node.left,maxSum));
        int rs = Math.max(0,sumFinder(node.right,maxSum));
        maxSum[0] = Math.max(maxSum[0],node.val+ls+rs);
        return node.val+Math.max(ls,rs);
    }
}