package blz.com.queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> newQueue = new Queue<>();
        newQueue.enQueue(56);
        System.out.println("after enque 56");
        newQueue.printQueue();
        newQueue.enQueue(30);
        System.out.println("after enque 30");
        newQueue.printQueue();
        newQueue.enQueue(70);
        System.out.println("after enque 70");
        newQueue.printQueue();

        newQueue.deQueue();
        System.out.println("after deleting 1st element 56 \n ");
        newQueue.printQueue();
        newQueue.isEmpty();
        System.out.println("....");
        newQueue.deQueue();
        System.out.println("after deleting 2nd element 30 \n ");
        newQueue.printQueue();
        newQueue.isEmpty();
        System.out.println("....");
        newQueue.deQueue();
        System.out.println("after deleting 3rd element 70\n ");

        newQueue.isEmpty();
    }
}
