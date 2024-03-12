package binarySearchTrees;

public class BSTSearch {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            // this.left = null;
            // this.right = null;
        }
    }

    public static Node insert(Node root , int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);

        }
        else{
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inOrder(Node root){
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static boolean Search(Node root , int key){
        if (root == null) {
            return false;
        }
        if(root.data == key){
            return true;
        }
        if (root.data> key) {
            return Search(root.left, key);
        }
        //  (root.data < key)
        else {
            return Search(root.right, key);
        }
    }

    public static void main(String[] args) {
       int val[] = {5,1,3,4,2,7};

       Node root = null;
       for(int i =0 ; i<val.length ; i++){
        root = insert(root, val[i]);
       }

       inOrder(root);
       System.out.println();
       int key = 6 ;
       System.out.println(Search(root, key));
    }
}
