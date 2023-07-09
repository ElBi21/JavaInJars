package Lesson_12;

/** What is a thread? Simply put, it's the execution of some processes that allows to make some sort of parallelism
 * (similar to spacial parallelism, because multiple "copies" of the same hardware are working at the same moment on
 * multiple different tasks). Each thread has its own program counter, stack, and local variables, but they share the
 * same memory space and resources of the process. */
public class ThreadTest {
    private static boolean thread7State = true;
    private static int thread7Counter = 0;

    public static void TestThread() {
        Thread thread0 = new Thread();

        Thread thread1 = new WordPrinter("I am the first thread!");
        Thread thread2 = new WordPrinter("And I am the second one!");

        Thread thread3 = new SleepyWordPrinter("THIIIIIIRD!", 1000);
        Thread thread4 = new SleepyWordPrinter("Yawn... I'm the fourth", 100);

        Thread thread5 = new CompulsiveWordPrinter("Snorlax is taking his nap", 100);
        Thread thread6 = new CompulsiveWordPrinter("FAST AS F**K BOYYY", 20);

        thread0.start();    // Does nothing, since run() is empty
        thread1.start();
        thread2.start();

        thread3.start();
        // thread3.interrupt(); // This will trigger the InterruptedException and activate the try {} catch {} block,
                                // printing the string that notifies that the thread was started, but it was interrupted
        thread4.start();

        thread5.start();
        thread6.start();

        try {
            Thread.currentThread().sleep(500);
            System.out.printf("Stopped %s\n", Thread.currentThread().getName());
        } catch (InterruptedException e) {

        }

        thread5.interrupt();
        thread6.interrupt();

        // We saw in Lesson 11 how Runnables can also be created with lambda expressions. In this case we are first
        // creating a Runnable, then we are making a Thread out o

        Runnable customThread = () -> {
            System.out.println("Heyy! A custom Thread started");
        };
        new Thread(customThread).run(); // Since Thread implements

        Thread thread7 = new Thread(() -> {
            while (thread7State) {
                System.out.println("FAAAAAAST");
                thread7Counter++;
                if (thread7Counter == 250) {
                    thread7State = false;
                }
            }
        });
        thread7.start();

        // If we had a thread made in this way
        Thread thread8 = new Thread(() -> {while (true) {
            System.out.println("Hello world!");
        }});
        thread8.start();

        // It would just run infinitely. Can we stop it with interrupt()?
        thread8.interrupt();
        thread8.stop();
        // We can stop it with stop(), but it's deprecated because of the unsafety of the method itself: the abrupt stop
        // of a thread during a complex process would only create issues of, for instance, possible data corruption.
    }
}
