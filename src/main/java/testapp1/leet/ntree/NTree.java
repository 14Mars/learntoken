package testapp1.leet.ntree;


import java.util.ArrayList;
import java.util.List;

public class NTree {

    public List<Integer> preorder(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        doPreorder(result, root);
        return result;
    }

    /**
     * n叉树的前序遍历
     * @param result
     * @param root
     */
    public void doPreorder(List<Integer> result, Node root) {
        if (root == null) {
            return;
        }
        result.add(root.val);
        for (Node child : root.children) {
            doPreorder(result, child);
        }
    }





    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<Integer>();
        doPostOrder(result, root);
        return result;
    }


    public void doPostOrder(List<Integer> result, Node root) {
        if (root == null) {
            return;
        }
        for (Node child : root.children) {
            doPostOrder(result, child);
        }
        result.add(root.val);
    }
}
