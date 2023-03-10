package blz.com.linkedlist;

public class LinkedListOne<T> {
    Node<T> head;
    Node<T> tail;

    public void add(T key) {
        Node<T> node = new Node<T>();
        node.key = key;
        node.next = head;
        head = node;
    }

    public void push(T key) {
        Node<T> newNode = new Node(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void append(T key) {
        Node<T> newNode = new Node(key);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void insertAfter(Node<T> prevNode, T key) {
        Node<T> newNode = new Node<T>();
        newNode.key = key;
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public T pop() {
        if (head == null) {
            return null;
        }
        Node<T> tempNode = head;
        head = head.next;
        return tempNode.key;
    }

    public T popLast() {
        Node<T> tempNode = head;
        while (tempNode.next.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = null;
        return tempNode.key;
    }

    public Node<T> search(T data) {
        Node<T> tempNode = head;
        while (tempNode != null) {
            if (tempNode.key == data) {
                System.out.println("Key found" + data);
                break;
            }
            tempNode = tempNode.next;
        }
        return tempNode;
    }

    public void insert(int index, T key) {
        Node<T> node = new Node();
        node.key = key;
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;
    }

    public void deleteNode(T key) {
        Node<T> tempNode = search(key);
        Node<T> prevNode = head;
        while (prevNode != null) {
            if (prevNode == tempNode) {
                head = tempNode.next;
                break;
            } else if (prevNode.next == tempNode) {
                prevNode.next = tempNode.next;
                tempNode.next = null;
            }
            prevNode = prevNode.next;
        }
    }

    public void size() {
        Node<T> tempNode = head;
        int count = 0;
        while (tempNode != null) {
            count++;
            tempNode = tempNode.next;
        }
        System.out.println("Size of the linked list is: " + count);
    }

    public void display() {
        Node<T> tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode.key + "->");
            tempNode = tempNode.next;
        }
        System.out.println();
    }
}