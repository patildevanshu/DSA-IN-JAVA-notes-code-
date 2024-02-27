package LinkedList;

import CONDSTATE.incometax;

public class basics {

    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
        
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        // step 1
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        // step2
        newNode.next = head; // linking step 

        // step 3
        head = newNode;

    }

    public void addLast(int data){

        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){ // O(n)
        if (head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public void add(int idx, int data){
        if (idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0 ;

        while (i < idx -1) {
            temp = temp.next;
            i++;
        }
        // i = idx -1 ;temp = prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst(){
        if (size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1 ){
            size--;
            int val = head.data;
            head = tail = null;
            return val;
        }
        size--;
        int val = head.data;
        head = head.next;
        return val;
    }

    public int removeLast(){
        if (size == 0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size == 1 ){
            size--;
            int val = head.data;
            head = tail = null;
            return val;
        }
        // prev = i = size-2
        Node prev = head;
        for (int i =0 ; i<size-2; i++){
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // (itteratives) search for a key in a linked list . return thr possition whereit found ,
    // if not found , return -1
    public int search(int key){
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key){
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    //(recursive) search for a key in a linked list . return thr possition whereit found ,
    // if not found , return -1
    public int helpper(Node head , int key){
        if (head == null){
            return -1;
        }
        if (head.data == key ){
            return 0;
        }
        int idx = helpper(head.next , key);
        if (idx == -1){
            return -1;
        }
        return idx+1;
    }
    public int searchRec(int key){
        return helpper(head , key);
    }

    // reverse a ll O(n)
    public void reverse(){
        Node prev = null;
        Node curr = tail=  head;
        Node next;

        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // find & remove nth node from END  (iterative approach)

    public void deleteNthfromEnd(int n){
        // calculate size
        int sz = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }

        if (n == sz){
            head = head.next; // remove first
            return;
        }
        // sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while (i<iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // slow is my middle
    }

    public boolean checkPalindrome(){
        if (head==null || head.next == null){
            return true;
        }
        // step1 = findmid
        Node midNode = findMid(head);

        // step2 = reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left = head;

        // step3 = check left & right half
        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }



    public static void main(String[] args) {
        basics ll = new basics();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.add(2, 9);
        ll.print();
        System.out.println(ll.size);

        // ll.removeFirst();
        // ll.removeLast();
        
        System.out.println(ll.search(4));
        System.out.println(ll.searchRec(9));
        ll.print();
        ll.reverse();
        ll.print();
        ll.deleteNthfromEnd(3);
        ll.print();
        System.out.println(ll.checkPalindrome());
        ll.print();



    }
}
