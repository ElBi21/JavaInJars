package Lesson_13;

public class DeadManWalking extends Thread {
    // Two locks nested on different monitors
    Object object1, object2;

    public DeadManWalking (Object object1, Object object2) {
        this.object1 = object1;
        this.object2 = object2;
    }

    public void run() {
        // When the run() method gets called, the first Thread that will be executed will try to acquire the lock on
        // object1. If the lock is free, then the Thread will acquire such lock, but if the lock isn't free, then the
        // Thread will wait until the lock is free. The Thread will try then to do the same with Object2
        synchronized (object1) {

            // We can create a deadlock by putting this try {} catch {} block. But why is it so much important? In Java,
            // any thread stops whenever there is an exception, of any type. This is why also the program stops if it
            // encounters an exception, and that's because the program is by itself a thread (it's called the Main
            // Thread). By removing the possibility of catching the InterruptedException, the thread will never stop.
            // But if we remove the possibility of catching such exception, then the thread will never be stopped, it
            // will continue to exist, even if inactive. This means that the Thread, even if it's not running anymore,
            // still keeps the lock on the monitor "object1". This doesn't allow the second thread to continue, since
            // the lock is being held by another object. We created thus a situation where the first thread will never
            // release the lock, and the second thread will continue to try to obtain the lock, even if he will never be
            // able to obtain it. We call this even a deadlock

            /*try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            synchronized (object2) {
                System.out.println("I am " + getName() + " and I join you in the fight!");
            }
        }
    }
}