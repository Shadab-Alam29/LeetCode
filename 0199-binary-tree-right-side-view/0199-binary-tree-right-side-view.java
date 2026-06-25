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
    public List<Integer> rightSideView(TreeNode root) {
       List<Integer> l = new ArrayList<>();
       fun(root , l , 0);
       return l; 
    }
    void fun ( TreeNode root , List<Integer> l , int level ){
        if ( root == null) return ;
        if (level == l.size())l.add(root.val);
        fun(root.right , l , level+1);
        fun(root.left , l , level+1);  
    }
}

// using level order traversing 

// class Solution {
//     public List<Integer> rightSideView(TreeNode root) {
//         List<List<Integer>> ans = levelOrder(root);
//         List<Integer> res = new ArrayList<>();
//         for ( int i = 0 ;i < ans.size();i++){
//             res.add(ans.get(i).get(ans.get(i).size() - 1));
//         }
//         return res ;
//     }
//      public List<List<Integer>> levelOrder(TreeNode root) {
//         List<List<Integer>> ans = new ArrayList<>();
//         Queue<TreeNode> q = new LinkedList<>();
//         if (root == null)return ans;
//         q.add(root);
//         while (!q.isEmpty()) {
//             int size = q.size();
//             List<Integer> l = new ArrayList<>();
//             while (size-- > 0) {
//                 TreeNode f = q.poll();
//                 l.add(f.val);
//                 if (f.left != null) q.add(f.left);
//                 if (f.right != null) q.add(f.right);
//             }
//             ans.add(l);
//         }
//         return ans;
//     }
// }