package Lesson_04;
import Lesson_08.*;

/** The class implements {@code stacks} via the use of an {@link IntList}
 * */

public class ListStack implements Stack {
    /**The length of the stack*/
    public int len = 0;
    /**The list that implements the stack, of type {@link IntList}*/
    private IntList list = null;

    /** Returns {@code true} if the stack is empty, {@code false} otherwise */
    public boolean is_empty () {
        return len == 0;
    }

    /**Pushes a value {@code v} into the {@code stack}, on the uppermost position
     * @param v the value to insert into the {@code stack}*/
    public void push (int v) {
        list = new IntList(v, list);
        len++;
    }

    /**Pops the uppermost element of the {@code stack}, returning it
     * @throws EmptyStackException if the stack is {@code empty}*/
    public int pop () throws EmptyStackException {
        if (len == 0) throw new EmptyStackException();

        int top = list.head;
        list = list.tail;
        len--;
        return top;
    }
}