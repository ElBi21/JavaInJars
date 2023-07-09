package Lesson_12;

public class SleepyWordPrinter extends WordPrinter {
    private final int delay;

    /** Before printing it sleeps for a certain amount of time (given by {@code delay})*/
    public SleepyWordPrinter (String word, int delay) {
        super(word);    // Creates a WordPrinter with the word given
        this.delay = delay;
    }

    public void run() {
        try {
            sleep(delay);
            super.run();
        } catch (InterruptedException exception) {
            System.out.println("Someone tried to wake " + this.getName() + "! Who was it?");
        }
    }
}