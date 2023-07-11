package Lesson_15;

/** Implementation of queues with linked lists */
public class SynchroQueue <E> {
    protected ListElem<E> firstElement = null;
    protected ListElem<E> lastElement = null;

    public synchronized boolean isEmpty() {
        return (firstElement == null);
    }

    public synchronized void insert(E element) {
        System.out.println("Inserting element " + element);

        if (isEmpty()) {
            firstElement = lastElement = new ListElem<>(element);
            notifyAll();
        } else {
            lastElement.next = new ListElem<>(element);
            lastElement = lastElement.next;
        }
    }

    public synchronized E extract() throws InterruptedException {
        while (isEmpty()) {
            wait();
        }

        E result = firstElement.value;
        System.out.println("Extracting " + result);

        firstElement = firstElement.next;
        if (firstElement == null) {
            lastElement = null;
        }
        return result;
    }
}
