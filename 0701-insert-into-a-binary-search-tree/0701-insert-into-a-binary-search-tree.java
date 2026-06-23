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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode temp = new TreeNode (val) ;
        return fun (root , temp );
    }
TreeNode fun(TreeNode root, TreeNode temp) {
    if (root == null)
        return temp;

    if (root.val > temp.val) {
        root.left = fun(root.left, temp);
    } else {
        root.right = fun(root.right, temp);
    }

    return root;
    }
}