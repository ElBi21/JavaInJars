package Lesson_14;

public class Popper extends Thread {
    private Stack stk;

    public Popper(Stack stk) {
        this.stk = stk;
    }

    @Override
    public void run() {
        try {
            stk.pop();
        } catch (InterruptedException exception) {
            System.out.println("[Po] Exception raised and caught! " + exception);
        }
    }
}
