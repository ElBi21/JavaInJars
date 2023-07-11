package Lesson_15;

import java.util.Random;

/** Essentially, a doll inserts herself (as an object) in the ball's queue and waits (using herself as monitor) until a
 * guy wakes her up. This is repeated till the end of the ball.
 */
public class Doll extends Thread {
    public Doll (String nome) {
        super();
        setName(nome);
    }

    public synchronized void wakeUp () {
        notify();
    } // called by the guys

    @Override
    public synchronized void run() { // synchronized!
        Random random = new Random();
        try {
            for (int i = 0; i < Ballroom.MAXDANCES; i++) {
                if (isInterrupted()) throw new InterruptedException();
                sleep(random.nextInt(50));
                Ballroom.queue.insert(this);
                wait();
                System.out.println(getName() + ": Oh my, that's a kiss!");
            }
        } catch (InterruptedException e) {
            System.out.println("bye guys!");
        }
    }
}
