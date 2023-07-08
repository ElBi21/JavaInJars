package Lesson_03;
import Lesson_08.*;

/** In computer programming, a {@code stack} is a data structure that stores a collection of elements, with
 * two main operations: push, which adds an element to the top of the stack, and pop, which removes
 * the top element from the stack. The stack follows the <em>Last In First Out (LIFO)</em> principle, meaning
 * that the last element added to the stack is the first one to be removed. A stack can be implemented
 * using an array or a linked list. Here we are trying to implement it via an array.
 *
 * <p> {@code Arrays} are implemented by specifying the type of data that the array will contain and the length.
 * If we do for example
 *
 * <p>
 * {@code int[] myArray = new int[L]}
 *
 * <p> then we are specifying a new array of integers of length L, where L can be either an already specified
 * integer or just a given integer.
 *
 * <p> We'll notice that have some problems though: what if we try to pop when the stack is at position (so top) 0? We don't want that.
 *  We can solve it by writing custom exceptions for the stack, that we throw when some behaviours occur. That would
 *  happen also if we want to add too many elements: we recall that arrays in Java have fixed lengths.
 * */

public class ArrayStack implements Stack {
    private final static int SIZE = 10;
    private int[] stk;

    /** Since the stack follows the <em>LIFO principle</em>, we just need to remember what's the position of
     * the last item of the stack. In order to access to the rest of the stack, we just have to pop
     * until we get to the element that we need.
     * */
    private int top = -1;

    public ArrayStack() {
        stk = new int[SIZE];
    }

    /** Here we define two different constructors, depending on if we pass a length or not
     * @param l the length of the stack*/
    ArrayStack(int l) {
        stk = new int[l];
    }

    /** Since all the attributes are private, then we are retrieving the length via public methods */
    public int length () {
        return stk.length;
    }

    /** Now we want to implement the two most important methods: push and pop */
    public void push (int v) {
        // inserts an int on top of the stack
        stk[++top] = v;
    }

    /** We don't need the pop to actually remove the item, because the push will overwrite the previous values. In
     * general, {@code pop()} will extract the top element and return it */
    public int pop () {
        return stk[top--];
    }

    public void print() {
        int counter = 0;
        for (int item : stk) {
            System.out.printf("Item %s: %s\n", counter, item);
            counter++;
        }
    }

    public boolean is_empty () {
        return top == -1;
    }
}