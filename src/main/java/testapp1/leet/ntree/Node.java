package testapp1.leet.ntree;

import java.util.List;

/**
 * Created by bao on 2020/3/31.
 */
class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};