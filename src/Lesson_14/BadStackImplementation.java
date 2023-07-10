package Lesson_14;

/** It implements tha ADT of stacks of integers in a
 *  concurrent setting. The critical parts of push and pop
 *  are synchronized. When a popper finds an empty stack it
 *  goes to sleep, and it does so *outside* the synchronized
 *  block. It won't work because in between test and stack
 *  update there may be interferences! Sleeping inside (that
 *  is declaring push and pop synchronized) won't work either,
 *  because sleep() does not release locks.
 */
public class BadStackImplementation implements Stack {
    private int[] stk;
    private int top = -1;

    BadStackImplementation(int length) {
        stk = new int[length];
    }

    private void rest() throws InterruptedException {
        Thread.currentThread().sleep(100);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == (stk.length - 1);
    }

    /** Pushes an int on top of the stack if there is room for it, otherwise it *rests* and then tries again
     * @param value the value to push into the stack
     * */
    public void push(int value) throws InterruptedException {
        while (isFull()) {
            rest();
        }

        synchronized (this) {
            System.out.println("Pushing " + value + " into the stack");
            top++;
            stk[top] = value;
        }
    }

    /** Pops and returns the top element if it exists, otherwise it *rests* ant then tries again */
    public int pop() throws InterruptedException {
        while (isEmpty()) {
            rest();
        }

        synchronized (this) {
            int toReturn = stk[top];
            top--;
            System.out.println("Popping " + toReturn + " out of the stack");
            return toReturn;
        }
    }
}
