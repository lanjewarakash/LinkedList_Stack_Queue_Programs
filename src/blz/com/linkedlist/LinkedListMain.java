package blz.com.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListMain.CreateSimpleLinkedList();
        LinkedListMain.addingElements();

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

    public static void addingElements() {
        LinkedListOne<Integer> ll = new LinkedListOne<>();
        ll.add(70);
        System.out.println("after adding 70");
        ll.display();
        ll.add(30);
        System.out.println("after adding 30");
        ll.display();
        ll.add(56);
        System.out.println("after adding 56");
        ll.display();
        System.out.println("\nwhile adding, the new elements will get added in front " +
                "\nso required output ===> 56,30,70");
        ll.display();

    }
}
