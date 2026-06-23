class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (root == null)return ans;
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            while (size-- > 0) {
                TreeNode f = q.poll();
                l.add(f.val);
                if (f.left != null) q.add(f.left);
                if (f.right != null) q.add(f.right);
            }
            ans.add(l);
        }
        return ans;
    }
}