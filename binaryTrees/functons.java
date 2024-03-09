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
/*----------------------------------------------------------------------- */

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }
/*----------------------------------------------------------------------- */
    public static int count(Node root) { // O(n)
        if (root == null) {
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);

        return (lc + rc + 1);
    }
/*----------------------------------------------------------------------- */
    public static int sumOfNodes(Node root) { // O(n)
        if (root == null) {
            return 0;
        }

        int ls = sumOfNodes(root.left);
        int rs = sumOfNodes(root.right);

        return (ls + rs + root.data);
    }
/*----------------------------------------------------------------------- */
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
/*----------------------------------------------------------------------- */
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
                                                                                                        -> true

    }
/*----------------------------------------------------------------------- */
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
/*--------------------------------------------------------------------------------- */

    public static void Klevel(Node root , int level ,int k){
        if (root == null) {
            return;
        }

        if (level == k) {
            System.out.print(root.data + " ");
        }

        Klevel(root.left, level+1, k);
        Klevel(root.right, level+1, k);
    }
/*--------------------------------------------------------------- */
        // O(n)
    public static boolean getPath(Node root , int n ,ArrayList<Node> path){
        if (root == null) {
            return false;
        }

        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean foundLeft = getPath(root.left, n, path);
        boolean foundRight = getPath(root.right, n, path);

        if (foundRight || foundLeft) {
            return true;
        }

        path.remove(path.size()-1);
        return false;
    }
    public static Node lca(Node root , int n1 , int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root , n1 ,path1);
        getPath(root , n2 ,path2);

        // last common ancester
        int i = 0;
        for(; i<path1.size() && i<path2.size() ; i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        // lca -> i-1th
        Node lca = path1.get(i-1);
        return lca;
    }
/*------------------------------------------------------------ */
    public static int lcaDist(Node root , int n){
        if (root == null) {
            return -1;
        }
        
        if (root.data == n) {
            return 0;
        }

        int leftdist = lcaDist(root.left, n);
        int rightdist = lcaDist(root.right, n);
        
        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }else if (leftdist == -1) {
            return rightdist +1;
        }else  {
            return leftdist +1;
        }
        
    }

    public static int minDist(Node root , int n1 , int n2){
        Node lca = lca2(root, n1, n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca , n2);

        return dist1+dist2;
    }

    public static Node lca2(Node root , int n1 , int n2){

        if (root == null || root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftlca = lca2(root.left, n1, n2);
        Node rightlca = lca2(root.right, n1, n2);

        // leftlca-> val && rightlca == null

        if (rightlca == null) {
            return leftlca;
        }
        if (leftlca == null) {
            return rightlca;
        }

        return root;
        
    }
    /*------------------------------------------------- */

    public static int kAncestor(Node root , int n , int k){
        if (root == null) {
            return -1;
        }
        if (root.data == n) {
            return 0;
        }

        int leftdist = kAncestor(root.left, n, k);
        int rightdist = kAncestor(root.right, n, k);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        }

        int max = Math.max(leftdist, rightdist);
        if(max+1 == k){
            System.out.println(root.data);
        }
        return max+1;
    }
    /*--------------------------------------------------- */;

    public static int transform(Node root){
        if (root == null) {
            return 0;
        }
        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;
        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data =  newLeft + leftChild + newRight + rightChild;
        return data;
    }
    public static void preorder(Node root) { // O(n)
        if (root == null) {
            // System.out.print(-1 + " ");
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
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

        // topView(root);
        // topView(subRoot);

        // Klevel(root, 1, 3);

        // System.out.println(lca2(root, 04, 7).data);;
        // System.err.println(minDist(root, 4, 7));
        // System.out.println(kAncestor(root, 5, 1 ));
        preorder(root);
        System.out.println();
        transform(root);
        preorder(root);

    }
}
