package Lesson_14;

public class Pusher extends Thread {
    private Stack stk;
    private int value;

    public Pusher(Stack stk, int value) {
        this.stk = stk;
        this.value = value;
    }

    @Override
    public void run() {
        try {
            stk.push(value);
        } catch (InterruptedException exception) {
            System.out.println("[PU] Exception raised and caught! " + exception);
        }
    }
}
