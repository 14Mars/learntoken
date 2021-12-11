package com.test.learn2.search;


public class BST<Key extends Comparable<Key>, Value> {
    private Node root; //根节点


    /**
     * 树节点个数
     * @return
     */
    public int size() {
        return size(root);
    }

    /**
     * 特定节点为根的子树中，节点的个数
     * @param node
     * @return
     */
    private int size(Node node) {
        if (node == null) {
            return 0;
        } else {
            return node.nodeCount;
        }
    }

    /**
     * 查找值
     * @param key
     * @return
     */
    public Value get(Key key){
//        return get(root, key);

        //TODO
        return null;
    }

    /**
     * 插入值
     * @param key
     * @param val
     */
    public void put(Key key,Value val){
        //TODO
    }


    // max()、 min()、 floor()、 ceiling()方法请见算法3.3（续2）
// select()、 rank()方法请见算法3.3（续3）
// delete()、 deleteMin()、 deleteMax()方法请见算法3.3（续4）
// keys()方法请见算法3.3（续5）




    //节点类
    private class Node {
        private Key key;//键
        private Value val;//值
        private Node left;//左子树链接
        private Node right;//右子树链接
        private int nodeCount;//以该节点为根的子树中的节点总数

        //构造器
        public Node(Key key, Value val, int nodeCount) {
            this.key = key;
            this.val = val;
            this.nodeCount = nodeCount;
        }

    }


}
