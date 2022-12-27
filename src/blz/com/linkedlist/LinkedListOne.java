package blz.com.linkedlist;

public class LinkedListOne<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T key) {
        Node<T> newNode = new Node();
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void add(T key) {
        Node<T> node = new Node<T>();
        node.key = key;
        node.next = head;
        head = node;
    }

    public void display() {
        Node<T> tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.key + "-> ");
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}