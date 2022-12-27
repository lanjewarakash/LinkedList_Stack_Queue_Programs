package blz.com.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListMain.CreateSimpleLinkedList();

    }
    public static void CreateSimpleLinkedList() {
        LinkedListOne<Integer> ll = new LinkedListOne<>();
        ll.push(70);
        System.out.println("After push 70");
        ll.display();
        ll.push(30);
        System.out.println("After push 30");
        ll.display();
        ll.push(56);
        System.out.println("After push 56");
        ll.display();
        System.out.print("The simple LinkedList created : ");
        ll.display();

    }
}
