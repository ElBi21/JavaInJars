package Lesson_13;

/** It provides a printName method which prints 70 + 70 times
 * the name of the current thread, un-synchronized in the first
 * chunk, synchronized in the second
 */
public class NamePrinter {
    // public synchronized void printName () {
    public void printName () {
        // synchronized (this) {
        for (int i = 0; i < 10; i++) {
            System.out.println("I am " + Thread.currentThread().getName());
        }

        // There is a difference between synchronized (new Object()) and synchronized(this). Synchronized(new Object())
        // allows for a block to be executed by multiple threads at the same time, so the execution of the block is
        // bound to a new Object for each thread, making the method executable by multiple instances at once; instead,
        // synchronized(this) lets only one thread at a time to execute the block

        synchronized (new Object()) {
        // synchronized (this) {
            for (int j = 0; j < 10; j++) {
                System.out.println("... and I print " + Thread.currentThread().getName());
            }
        }
    }
}