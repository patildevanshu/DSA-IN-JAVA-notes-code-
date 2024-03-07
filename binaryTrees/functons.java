package binaryTrees;

import java.util.*;

public class functons {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int count(Node root) { // O(n)
        if (root == null) {
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);

        return (lc + rc + 1);
    }

    public static int sumOfNodes(Node root) { // O(n)
        if (root == null) {
            return 0;
        }

        int ls = sumOfNodes(root.left);
        int rs = sumOfNodes(root.right);

        return (ls + rs + root.data);
    }

    // diameter of tree = no. of nodes in the logest path between 2 leaves
    // approach 1 O(n^2 )
    public static int diameter(Node root) {
        if (root == null) {
            return 0;
        }

        int leftDiam = diameter(root.left);
        int leftHeight = height(root.left);
        int rightDiam = diameter(root.right);
        int rightHeight = height(root.right);

        int selfDiameter = leftHeight + rightHeight + 1;

        return Math.max(selfDiameter, Math.max(rightDiam, leftDiam));
    }

    public class Info {
        int diam;
        int ht;

        public Info(int diam, int ht) {
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter2(Node root) { // O(n)
        if (root == null) {
            return new Info(0, 0);
        }

        Info leftInfo = diameter2(root.left);
        Info rightInfo = diameter2(root.right);

        int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;
        return new Info(diam, ht);
    }

    // Subtree of another Tree
    // Given the roots of two binary trees root and subRoot, return true if there is
    // a subtree of root with the same structure and node values of subRoot and
    // false otherwise
    public static boolean isIdenticle(Node root, Node subRoot) {
        if (root == null && subRoot == null) {
            return true;
        } else if (root == null || subRoot == null || root.data != subRoot.data) {
            return false;
        }

        if (!isIdenticle(root.left, subRoot.left)) {
            return false;
        }
        if (!isIdenticle(root.right, subRoot.right)) {
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subRoot) {

        if (root == null) {
            return false;
        }
        if (root.data == subRoot.data) {
            if (isIdenticle(root, subRoot)) {
                return true;
            }
        }

        return isSubtree(root.left, subRoot) /* leftsubtree -> true */ || isSubtree(root.right, subRoot); // rightsubtree
                                                                                                          // -> true

    }

    /*------------------------------------------------------------- */
    static class Innfo {
        Node node;
        int hd;

        public Innfo(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        // level order
        Queue<Innfo> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0;
        int max = 0;

        q.add(new Innfo(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            Innfo curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if (!map.containsKey(curr.hd)) { // first time hd is occuring
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Innfo(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Innfo(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }
            }

        }

        for (int i = min; i <= max; i++) {
            System.out.print(map.get(i).data + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {

        /*
         *   1
         *  /  \
         *  2  3
         * / \ / \
         * 4 5 6 7
         * 
         * 
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /*
         * subroot
         * 2
         * / \
         * 4 5
         */

        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5);

        // System.out.println(isSubtree(root, subRoot));

        // System.out.println(height(root));
        // System.out.println(count(root));
        // System.out.println(sumOfNodes(root));
        // System.out.println(diameter(root));
        // // System.out.println(diameter2(root).diam);
        // // System.out.println(diameter2(root).ht);

        topView(root);
        topView(subRoot);
    }
}
