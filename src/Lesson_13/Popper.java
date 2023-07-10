package Lesson_13;
import Lesson_03.EmptyStackException;

public class Popper extends Thread {
    private ArrayStack stack;

    public Popper (ArrayStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        try {
            System.out.println(stack.pop());
        } catch (EmptyStackException e) {
            System.out.println("EmptyStackException while popping! " + e);
        } catch (InterruptedException e) {
            System.out.println("Was sleeping...");
        }
    }
}