package blz.com.queue;

public class Queue<T> {
    QueueNode<T> head;
    QueueNode<T> tail;

    public void enQueue(T data) {
        QueueNode<T> newNode = new QueueNode<>();
        newNode.data = data;
        newNode.next = head;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public T deQueue() {
        QueueNode<T> tempNode = head;
        head = head.next;
        return tempNode.data;

    }

    public void isEmpty() {
        if (tail == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public void printQueue() {
        QueueNode<T> tempNode = head;
        while (tempNode != tail) {
            System.out.print(tempNode.data + "->");
            tempNode = tempNode.next;
        }
        System.out.println(tempNode.data);
    }
}