package Lesson_03;

/** This implementation of the {@link ArrayStack} class uses also the relatives {@link FullStackException}
 * and {@link EmptyStackException}, which are both an extension of the {@link Exception} class.
 * */

public class ArrayStack2 { // ...with exceptions
    private final static int SIZE = 10;
    private int[] stk;
    private int top = -1;

    ArrayStack2 () {
        stk = new int[SIZE];
    }

    ArrayStack2 (int l) {
        stk = new int[l];
    }

    public int length () {
        return stk.length;
    }

    /** Inserts an int on top of the stack, if there is room for it.
     *
     * <br><br>
     * Now, as we can see, the {@code push} method throws a {@link FullStackException} each time that we
     * try to push into the {@code stack} more elements than its maximum capacity.
     *
     * @param v the value that we want to push into the stack
     * @throws FullStackException if the capacity of the stack is exceeded
     * */
    public void push (int v) throws FullStackException {
        if (top == stk.length - 1)
            throw new FullStackException(v);

        stk[++top] = v;
    }

    /** Extracts the top element, if it exists, and returns it.
     * <br><br>
     * If we try to {@code pop} an element when the stack is empty, then an {@link EmptyStackException} will be
     * thrown. The method doesn't need any parameter. As we said for the {@code pop} method in {@link ArrayStack},
     * it's not necessary to clear the stack's slot, since it will be overwritten by the next element.
     * @return the upper element of the stack
     * @throws EmptyStackException if the stack is currently empty
     * */

    public int pop () throws EmptyStackException {
        if (top < 0)
            throw new EmptyStackException();

        return stk[top--];
    }

    public void print() {
        int counter = 0;
        for (int item : stk) {
            System.out.printf("Item %s: %s\n", counter, item);
            counter++;
        }
    }
}