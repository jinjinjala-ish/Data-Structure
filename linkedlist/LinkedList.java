package linkedlist;

public class LinkedList {
    private Node head; //시작이 누구인지
    private Node tail;  //마지막이 누구인지
    private int size = 0;  //리스트의 크기

    private class Node {
        private Object data;
        private Node next;

        public Node(Object input) {
            this.data = input;
            this.next = null;
        }

        public String toString() {
            return String.valueOf(this.data);
        }
    }

    public void addFirst(Object input) {
        Node newNode = new Node(input);
        newNode.next = head;
        head = newNode;
        size++;
        if (head.next == null) {
            tail = head;
        }
    }

    public void addLst(Object input) {
        Node newNode = new Node(input);
        if (size == 0) {
            addFirst(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public Node node(int index) {
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public void add(int k, Object input) { //k는 인덱스 값  //k = 2
        if (k == 0) {
            addFirst(input);
        } else {
            Node temp1 = node(k-1); //temp1 = 20
            Node temp2 = temp1.next; //temp2 = 30;
            Node newNode = new Node(input); //newNode = 25
            temp1.next = newNode;  //temp1.next = 25
            newNode.next = temp2;  //newNode.next = 30
            size++;
            if(newNode.next == null){
                tail = newNode;
            }
        }
    }
}
