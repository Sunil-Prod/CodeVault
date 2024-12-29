package Archieve.Challenges_2022.August;

public class LeftLeaveSum {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);

        Solution sol = new Solution();
        System.out.println(sol.sumOfLeftLeaves(root));
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    static class Solution {
        public int sumOfLeftLeaves(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int sum = 0;
            if (root.left != null && root.left.left == null && root.left.right == null) {
                sum = root.left.val;
            }

            return sum + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
        }
    }
}
