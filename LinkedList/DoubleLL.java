package LinkedList;

public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if (head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head =  newNode; 
    }

    // print
    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // remove
    public int removeFirst(){
        if (head == null ){
            System.out.println("doblyll is empty");
            return Integer.MIN_VALUE;
        }
        if(size == 1){
            int val = head.data;
            head = tail =null;
            size--;
            return val;
        }
        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
        
    }
    // reverse a ll O(n)
    public void reverse(){
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr!= null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
        head = prev;
    }    

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);
        dll.print();
        dll.removeFirst();
        dll.print();
        System.out.println(size);

        dll.reverse();
        dll.print();
        
    }
}
