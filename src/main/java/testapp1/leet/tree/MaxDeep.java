package testapp1.leet.tree;


public class MaxDeep {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + max(maxDepth(root.left), maxDepth(root.right));
    }

    public int max(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }


}
