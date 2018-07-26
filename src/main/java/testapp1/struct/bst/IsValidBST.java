package testapp1.struct.bst;

import testapp1.struct.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class IsValidBST {

    public boolean isValidBST(TreeNode root) {
        List<Integer> inorder = new ArrayList<Integer>();
        inorder = in_order(root, inorder);

        if (inorder.size() == 0) {
            return true;
        }

        boolean result = true;

        int size = inorder.size();


        for (int i = 0; i < size - 1; i++) {

            for (int j = i + 1; j < size; j++) {
                if (inorder.get(i) >= inorder.get(j)) {
                    return false;
                }
            }


        }
        return result;


    }


    private List<Integer> in_order(TreeNode root, List<Integer> inorder) {
        if (root == null) {
            return inorder;
        }

        in_order(root.left, inorder);
        inorder.add(root.val);
        in_order(root.right, inorder);

        return inorder;
    }


}
