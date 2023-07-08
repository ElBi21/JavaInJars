package Lesson_09;

public class GenericList <E> {
    // Conceptually, this is the same as IntList, but... it's generic! The parameter E stands for the type of the list
    // elements, and in our case we want this element to be as generic as possible. Note as the class is of type Generic

    private E head;
    private GenericList<E> tail = null;

    GenericList(E head, GenericList<E> tail) {
        this.head = head;
        this.tail = tail;
    }

    public E getHead() {
        return head;
    }

    public void pushElement(E e) {
        tail = new GenericList<E>(head, tail);
        head = e;
    }

    public void printList() {
        System.out.print(head + " ");
        if (tail == null)
            System.out.println();
        else
            tail.printList();
    }
}
