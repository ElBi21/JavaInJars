package Lesson_13;

/** Deliberately creates a deadlock: two dead man walking try to
 *  obtain locks over two monitors, but they do it in different order
 *  Using sleep (see DeadManWalking) to make deadlock happen!
 */
public class DeadLock {
    public static void TestDeadLock() {
        Object monitor1 = new Object();
        Object monitor2 = new Object();

        DeadManWalking deadlock1 = new DeadManWalking(monitor1, monitor2);
        deadlock1.setName("DeadLock1");

        DeadManWalking deadlock2 = new DeadManWalking(monitor2, monitor1);
        deadlock2.setName("DeadLock2");

        deadlock1.start();
        deadlock2.start();
    }
}
