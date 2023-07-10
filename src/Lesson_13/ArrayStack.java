package Lesson_13;
import Lesson_03.FullStackException;
import Lesson_03.EmptyStackException;

/** implementation of the stacks abstract data type (using exceptions).
  *  Method pop() is synchronized, method push is not; hence two concurrent
  *  pushers may extract the same element.
  */
public class ArrayStack {
    private int[] stk;
    private int top = -1;

    ArrayStack(int l) {
        stk = new int[l];
    }

    /** Returns the length of the stack */
    public int capacity () {
        return stk.length;
    }

    /** Inserts an element on top of the stack if there is room for it*/
    public void push (int v) throws FullStackException {
        if (top == stk.length - 1) throw new FullStackException(v);
        top = top + 1;
        stk[top] = v;
    }

    /** Extracts and returns the element on top of the stack, if the stack is not empty. If the method is
     * un-synchronized, the printing and the extraction by two threads may be interleaved. Normally, when synchronized
     * is written in a method, it generally refers to {@code this} (so it's like doing {@code synchronized (this) {}}).
     * */
    // public synchronized int pop () throws EmptyStackException, InterruptedException {
    public int pop () throws EmptyStackException, InterruptedException {
        System.out.println("It's me, " + Thread.currentThread().getName() + ", and I'm popping");

        synchronized (this) { // Alternative to synchronizing the whole method
        // synchronized (new Object()) { // Won't work: two poppers (see AMess) would synchronize on different objects.
        // They don't return any error though
        if (top < 0) {
            throw new EmptyStackException();
        }
        top = top - 1;
        Thread.currentThread().sleep(100);
        // This command, if in un-synchronized context, may
        // cause loss of elements (see AMess: 42 is lost)
        return stk[top + 1];
        }
    }

    public void printStack() {
        StringBuilder toPrint = new StringBuilder();
        toPrint.append("[");
        for (int item : stk) {
            toPrint.append(item).append(", ");
        }
        int lastComma = toPrint.lastIndexOf(",");
        toPrint.deleteCharAt(lastComma);
        int lastSpace = toPrint.lastIndexOf(" ");
        toPrint.deleteCharAt(lastSpace);
        toPrint.append("]");

        System.out.println(toPrint);
    }
}