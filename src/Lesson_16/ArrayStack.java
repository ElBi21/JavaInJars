package Lesson_16;

import Lesson_03.EmptyStackException;
import Lesson_03.FullStackException;

public class ArrayStack {
    protected int[] stk;
    private int top = -1;

    ArrayStack(int l) {
        stk = new int[l];
    }

    public void push(int v) throws FullStackException {
        if (top == stk.length - 1) throw new FullStackException(v);
        top = top + 1;
        stk[top] = v;
    }

    public int pop() throws EmptyStackException {
        if (top < 0) throw new EmptyStackException();
        top = top - 1;
        return stk[top + 1];
    }
}