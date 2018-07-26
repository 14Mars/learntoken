package testapp1.struct.tree;


import java.util.ArrayList;
import java.util.List;

/**
 * 前序遍历
 * 输入: [1,null,2,3]
    1
    \
    2
    /
    3

 输出: [1,2,3]
 *
 */
public class PreorderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList();
        result = preorder(root, result);

        return result;
    }

    /**
     *
     * @param root
     * @param resultList
     * @return
     */
    private List<Integer> preorder(TreeNode root, List<Integer> resultList) {
        if (root == null) {
            return resultList;
        }

        resultList.add(root.val);
        preorder(root.left, resultList);
        preorder(root.right, resultList);
        return resultList;
    }
}
