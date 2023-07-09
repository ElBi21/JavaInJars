package Lesson_12;

public class CompulsiveWordPrinter extends Thread {
    int delay;

    public CompulsiveWordPrinter(String name, int delay) {
        super(name);
        this.delay = delay;
    }

    public void run() {
        try {
            while (true) {
                sleep(delay);
                System.out.println(getName());
            }
        } catch (InterruptedException exception) {
            System.out.printf("Someone stopped %s after brutally waking him up... Who was it?\n", getName());
        }
    }
}
