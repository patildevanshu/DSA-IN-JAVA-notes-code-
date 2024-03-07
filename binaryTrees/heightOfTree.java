package binaryTrees;

public class heightOfTree {
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

    public static int height(Node root){
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh)+1;
    }

    public static int count(Node root){ //O(n)
        if(root == null){
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);

        return (lc+rc+1);
    }
 
    public static int sumOfNodes(Node root){ //O(n)
        if(root == null){
            return 0;
        }

        int ls = sumOfNodes(root.left);
        int rs = sumOfNodes(root.right);

        return (ls + rs + root.data);
    }

    // diameter of tree = no. of nodes in the logest path between 2 leaves

    public static void main(String[] args) {
        
        /*       1
         *     /   \
         *     2    3
         *    / \   / \
         *   4   5  6   7
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

        System.out.println(height(root));
        System.out.println(count(root));
        System.out.println(sumOfNodes(root));
    }
}
