package Lesson_04;

/** This class provides a coarse implementation of {@code linked lists} made out of only {@link Integer} values.
 * The class provides the following methods:
 * <li>{@code printList <n>}: prints the first {@code n} elements of the list;</li>
 * <li>{@code concat <l>}: appends the list to another list {@code l};</li>
 * <li>{@code loop}: concatenates this list to itself.</li>
 * */

public class IntList {
    /**Value of a {@link IntList}'s node
     * */
    public int head;
    /**The concatenated list, of type {@link IntList}*/
    public IntList tail;

    /** Default constructor for the {@link IntList} class.
     * @param head is the value of the node;
     * @param tail the linked node, of type {@link IntList}.
     * */
    IntList(int head, IntList tail) {
        this.head = head;
        this.tail = tail;
    }

    /* When an object calls a method of a class, via the "this" keyword we can access to the object itself. This can
    *  be useful while trying for instance to edit a value of such object (either via a method that ensures
    *  encapsulation or via directly accessing an attribute)
    * */

    /**Prints (recursively) the first {@code n} elements of the list
     * @param n the number of elements that we want to print*/
    public void printList(int n) {
        if (n <= 0) {
            System.out.println();
            return;
        }

        System.out.print(head + " ");
        if (tail == null) // it's a one element list
            System.out.println();
        else
            tail.printList(n - 1);
    }

    /**Appends the current list to a given list {@code l}
     * @param l the list to which the current list gets concatenated*/
    public void concat (IntList l) {
        if (tail == null)
            this.tail = l;
        else tail.concat(l);
    }

    /**Appends the current list to itself, creating a loop*/
    public void loop () {
        this.concat(this);
    }
}