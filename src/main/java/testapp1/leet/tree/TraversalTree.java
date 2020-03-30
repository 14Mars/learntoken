package testapp1.leet.tree;


import testapp1.struct.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class TraversalTree {

    public static void main(String[] args) {

    }




    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        //前序
        preorder(root, result);

//        //中序
//        inorder(root, result);
//
//        //后序
//        postorder(root, result);
        return result;
    }



    //前序遍历
    public void preorder(TreeNode node, List<Integer> resultList){
        if (node == null){
            return;
        }

        resultList.add(node.val);   //根节点操作
        preorder(node.left,resultList);//左子树
        preorder(node.right,resultList);//右子树
    }

    //中序遍历
    public void inorder(TreeNode node, List<Integer> resultList){
        if (node == null){
            return;
        }

        inorder(node.left,resultList);//左子树
        resultList.add(node.val);   //根节点操作
        inorder(node.right,resultList);//右子树
    }


    //后序遍历
    public void postorder(TreeNode node, List<Integer> resultList){
        if (node == null){
            return;
        }

        postorder(node.left,resultList);//左子树
        postorder(node.right,resultList);//右子树
        resultList.add(node.val);   //根节点操作
    }











}
