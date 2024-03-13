// package binarySearchTrees;

import java.util.*;
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

    public static Node delete(Node root , int val){
        if (root.data < val) {
            root.right = delete(root.right, val);
        }
        else if (root.data > val) {
            root.left = delete(root.left, val);
        }else{ // voila
            // case 1 - leaf node\
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null){
                return root.left;
            }

            // case 3
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);

        }

        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while (root.left == null) {
            root = root.left;
        }
        return root;
    }

    public static void PrintInRange(Node root , int k1 , int k2){
        if (root == null) {
            return;
        }
        if (root.data >= k1 && root.data <= k2) {
            PrintInRange(root.left, k1, k2);
            System.out.print(root.data + " ");
            PrintInRange(root.right, k1, k2);
        }
        else if (root.data <k1) {
            PrintInRange(root.left, k1, k2);
        }
        else{
            PrintInRange(root.right, k1, k2);
        }

    }

    public static void printPath(ArrayList<Integer> path){
        for(int i = 0 ;i<path.size() ; i++ ){
            System.out.print(path.get(i) + "->");
        }
        System.out.println("null");
    }

    public static void PrintRoot2Leaf(Node root , ArrayList<Integer> path){
        if (root == null) {
            return;
        }
        path.add(root.data);

        if (root.left == null && root.right == null) {
            printPath(path);
        }
        PrintRoot2Leaf(root.left, path);
        PrintRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }

    public static boolean isValidBst(Node root , Node min , Node max){
        if(root == null){
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }
        else if (max != null && root.data >= max.data) {
            return false;
        }

        return isValidBst(root.left, min, root)  && isValidBst(root.right, root, max);
    }

    public static void main(String[] args) {
       int val[] = {8,5,1,4,6,10,11,14};

       Node root = null;
       for(int i =0 ; i<val.length ; i++){
        root = insert(root, val[i]);
       }

       inOrder(root);
       System.out.println();
    //    int key = 6 ;
    //    System.out.println(Search(root, key));

    delete(root, 6);
    inOrder(root);
    System.out.println();

    // PrintInRange(root, 5, 12);
    System.out.println();
    PrintRoot2Leaf(root, new ArrayList<>());

    System.out.println(isValidBst(root, null, null));

    }
}
