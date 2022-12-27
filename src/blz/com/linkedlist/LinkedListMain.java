package blz.com.linkedlist;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedListMain.CreateSimpleLinkedList();
        LinkedListMain.addingElements();
        LinkedListMain.appendingElements();
        LinkedListMain.insertingElements();
        LinkedListMain.popFirstElements();

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
        System.out.println("while adding, the new elements will get added in front " +
                "\nso required output ===> 56,30,70");
        ll.display();

    }

    public static void appendingElements() {

        LinkedListOne<Integer> ll = new LinkedListOne<>();
        ll.display();
        ll.append(56);
        System.out.println("after append 56");
        ll.display();
        ll.append(30);
        System.out.println("after append 30");
        ll.display();
        ll.append(70);
        System.out.println("after append 70");
        ll.display();
        System.out.println("while appending, the new elements will get added to the end position" +
                "\nso required output is ====> 56,30,70");
        ll.display();
    }

    public static void insertingElements() {

        LinkedListOne<Integer> ll = new LinkedListOne<>();
        ll.append(56);
        System.out.println("After append 56");
        ll.display();
        ll.append(70);
        System.out.println("After append 70");
        ll.display();
        System.out.println("Before inserting the elements are=");
        ll.display();
        ll.insertAfter(ll.head, 30);
        System.out.println("inserting 30 between 56 and 70");
        ll.display();
    }

    public static void popFirstElements() {

        LinkedListOne<Integer> ll = new LinkedListOne<>();
        ll.append(56);
        System.out.println("after append 56");
        ll.display();
        ll.append(30);
        System.out.println("after append 30");
        ll.display();
        ll.append(70);
        System.out.println("after append 70");
        ll.display();
        System.out.println("data is : ");
        ll.display();
        System.out.println("required output sequence (after deleting first element ) ==> 30,70");
        System.out.println("Pop value is : " + ll.pop());
        ll.display();
    }
}