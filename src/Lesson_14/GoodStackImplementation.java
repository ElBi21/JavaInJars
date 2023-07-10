package Lesson_14;

/** A way to release locks is by using the {@code wait()} method, alongside {@code notify()} and {@code notifyAll()}.
 * The {@code wait()} method releases the lock, and puts the thread to sleep (different from the {@code sleep()} method,
 * that's not the same). The {@code notify()} method notifies the next Thread that is waiting, while {@code notifyAll()}
 * notifies all the Threads waiting, creating a sort of "race"*/
public class GoodStackImplementation implements Stack {
    private int[] stk;
    private int top = -1;

    GoodStackImplementation(int length) {
        stk = new int[length];
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
    public synchronized void push(int value) throws InterruptedException {
        while (isFull()) {
            wait();
        }

        System.out.println("Pushing " + value + " into the stack");
        top++;
        stk[top] = value;
        notifyAll();
        // Why are we using notifyAll() and not notify()? Because we don't know which is the next thread, so in order to
        // not create situations where the program would just indefinitely loop, we just notify all the waiting threads,
        // such that they can all concur to be the active thread, even if they will be eventually stopped again
    }

    /** Pops and returns the top element if it exists, otherwise it *rests* ant then tries again */
    public synchronized int pop() throws InterruptedException {
        while (isEmpty()) {
            wait();
        }

        int toReturn = stk[top];
        top--;
        System.out.println("Popping " + toReturn + " out of the stack");
        notifyAll();
        return toReturn;
    }
}
