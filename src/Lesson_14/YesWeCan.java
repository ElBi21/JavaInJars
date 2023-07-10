package Lesson_14;

/** The methods Object.wait(), Object.notify() or Object.notifyAll() can only be called by a thread holding a lock on
 * object "Object". This cannot be checked at compile time. Violation causes an IllegalMonitorStateException.
 */
public class YesWeCan {
    public synchronized void methodOne () throws InterruptedException {
        System.out.println("Executing method one");
        methodTwo();
    }

    public void methodTwo() throws InterruptedException {
        System.out.println("Executing method two");
        wait();
    }

    public static void TestYesWeCan() throws InterruptedException {
        YesWeCan ywc = new YesWeCan();
        // WRE: ywc.methodTwo(); // Can't execute this: IllegalMonitorStateException is raised. Threads, in order to
        // execute synchronized methods, need to possess the lock to their relative monitor
        ywc.methodOne(); // This is ok
        // The program continues to run indefinitely, as one would expect, but no IllegalMonitorStateException is
        // raised by Java.
    }
}
