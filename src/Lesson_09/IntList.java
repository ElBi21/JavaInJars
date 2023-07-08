package Lesson_09;

// Classic IntList class that we used in previous packages
public class IntList {
    private int head;
    private IntList tail = null;

    IntList(int head, IntList tail) {
        this.head = head;
        this.tail = tail;
    }

    /** Gets the head of the list */
    public int getHead() {
        return head;
    }

    /** Inserts a new head element */
    public void pushHead(int e) {
        // WRE: tail = this; // We can't do this. If we set tail = this, we are setting the tail as the current element,
        // WRE: creating a loop: the previous data would be overwritten by the current object, always pointing back to 4
        tail = new IntList(head, tail);
        head = e;
    }

    /** Prints the list */
    public void printList () {
        System.out.print(head + " ");
        if (tail == null)
            System.out.println();
        else
            tail.printList();
    }
}
